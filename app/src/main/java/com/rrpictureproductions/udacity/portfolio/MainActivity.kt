package com.rrpictureproductions.udacity.portfolio

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.longToast
import org.jetbrains.anko.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        popularMoviesButton .onClick { longToast(R.string.launch_popular_movies)         }
        stockHawkButton     .onClick { longToast(R.string.launch_stock_hawk)             }
        buildItBiggerButton .onClick { longToast(R.string.launch_build_it_bigger)        }
        makeMaterialButton  .onClick { longToast(R.string.launch_make_your_app_material) }
        goUbiquitousButton  .onClick { longToast(R.string.launch_go_ubiquitous)          }
        capstoneButton      .onClick { longToast(R.string.launch_capstone)               }

        portfolioGitHub     .onClick { browse(getString(R.string.github_portfolio))      }
        popularMoviesGitHub .onClick { longToast(R.string.github_popular_movies)         }
        stockHawkGitHub     .onClick { longToast(R.string.github_stock_hawk)             }
        buildItBiggerGitHub .onClick { longToast(R.string.github_build_it_bigger)        }
        makeMaterialGitHub  .onClick { longToast(R.string.github_make_your_app_material) }
        goUbiquitousGitHub  .onClick { longToast(R.string.github_go_ubiquitous)          }
        capstoneGitHub      .onClick { longToast(R.string.github_capstone)               }
    }
}
