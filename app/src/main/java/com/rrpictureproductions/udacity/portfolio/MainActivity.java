package com.rrpictureproductions.udacity.portfolio;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout main = (LinearLayout) findViewById(R.id.linearLayout);
        findViewById(R.id.portfolioGitHub).setOnClickListener(gitHubListener);
        View child;
        for (int i = 1; i < main.getChildCount(); i++) {
            child = main.getChildAt(i);
            if (child instanceof LinearLayout) {
                Button b = (Button)(((LinearLayout) child).getChildAt(0));
                ImageView g = (ImageView)((LinearLayout) child).getChildAt(1);
                b.setOnClickListener(buttonListener);
                g.setOnClickListener(gitHubListener);
            }
        }
    }

    private View.OnClickListener buttonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            onButtonClicked(view);
        }
    };

    private View.OnClickListener gitHubListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            onGitHubButtonClicked(view);
        }
    };

    void onButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.popularMoviesButton:
                launchApp(getString(R.string.popular_movies_app_id));
                break;
            case R.id.stockHawkButton:
                toastLong(R.string.launch_stock_hawk);
                break;
            case R.id.buildItBiggerButton:
                toastLong(R.string.launch_build_it_bigger);
                break;
            case R.id.makeMaterialButton:
                toastLong(R.string.launch_make_your_app_material);
                break;
            case R.id.goUbiquitousButton:
                toastLong(R.string.launch_go_ubiquitous);
                break;
            case R.id.capstoneButton:
                toastLong(R.string.launch_capstone);
                break;
        }
    }

    void onGitHubButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.portfolioGitHub:
                openLink(R.string.github_portfolio);
                break;
            case R.id.popularMoviesGitHub:
                toastLong(R.string.github_popular_movies);
                break;
            case R.id.stockHawkGitHub:
                toastLong(R.string.github_stock_hawk);
                break;
            case R.id.buildItBiggerGitHub:
                toastLong(R.string.github_build_it_bigger);
                break;
            case R.id.makeMaterialGitHub:
                toastLong(R.string.github_make_your_app_material);
                break;
            case R.id.goUbiquitousGitHub:
                toastLong(R.string.github_go_ubiquitous);
                break;
            case R.id.capstoneGitHub:
                toastLong(R.string.github_capstone);
                break;
        }
    }

    private void toastLong(@StringRes int stringId) {
        Toast.makeText(this, stringId, Toast.LENGTH_LONG).show();
    }

    private void launchApp(String applicationId) {
        Intent i = getPackageManager().getLaunchIntentForPackage(applicationId);
        if(i != null) {
            startActivity(i);
        } else {
            Toast.makeText(this, getString(R.string.app_not_found, applicationId), Toast.LENGTH_LONG).show();
        }
    }

    private void openLink(@StringRes int linkStringId) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(getString(linkStringId)));
        startActivity(i);
    }
}
