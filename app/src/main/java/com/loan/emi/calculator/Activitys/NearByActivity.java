package com.loan.emi.calculator.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.loan.emi.calculator.ADS.AdsManager;
import com.loan.emi.calculator.ADS.InterstitialAD;
import com.loan.emi.calculator.ADS.Native;
import com.loan.emi.calculator.R;
import com.loan.emi.calculator.databinding.ActivityNearByBinding;

public class NearByActivity extends AppCompatActivity {
    ActivityNearByBinding binding;
    InterstitialAD helper;
    AdsManager adsManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNearByBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.maincolor));

        showAlertDialog(this);

        Native aNative = new Native(this);
        aNative.ShowNative(this, findViewById(R.id.native_container), 2);

        Native aNative1 = new Native(this);
        aNative1.ShowNative(this, findViewById(R.id.native_container1), 2);

        adsManager = new AdsManager(this);
        helper = new InterstitialAD(this, this, adsManager);

        binding.imageView7.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    onBackPressed();
                }

                @Override
                public void onInterstitialDismissed() {
                    onBackPressed();
                }
            });

        });

        binding.near1.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    gmap("ATM");
                }

                @Override
                public void onInterstitialDismissed() {
                    gmap("ATM");
                }
            });
        });

        binding.near2.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    gmap("Art");
                }

                @Override
                public void onInterstitialDismissed() {
                    gmap("Art");
                }
            });
        });

        binding.near3.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    gmap("Bars");
                }

                @Override
                public void onInterstitialDismissed() {
                    gmap("Bars");
                }
            });
        });

        binding.near4.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    gmap("Banks");
                }

                @Override
                public void onInterstitialDismissed() {
                    gmap("Banks");
                }
            });
        });

        binding.near5.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    gmap("Beauty Salons");
                }

                @Override
                public void onInterstitialDismissed() {
                    gmap("Beauty Salons");
                }
            });
        });

        binding.near6.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    gmap("Bookstores");
                }

                @Override
                public void onInterstitialDismissed() {
                    gmap("Bookstores");
                }
            });
        });

        binding.near7.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    gmap("Clothes");
                }

                @Override
                public void onInterstitialDismissed() {
                    gmap("Clothes");
                }
            });
        });

        binding.near8.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    gmap("Coffee");
                }

                @Override
                public void onInterstitialDismissed() {
                    gmap("Coffee");
                }
            });
        });

        binding.near9.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    gmap("Car Dealers");
                }

                @Override
                public void onInterstitialDismissed() {
                    gmap("Car Dealers");
                }
            });
        });

        binding.near10.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    gmap("Gym");
                }

                @Override
                public void onInterstitialDismissed() {
                    gmap("Gym");
                }
            });
        });

    }

    private void gmap(String i)
    {
        String locationToSearch = i;

        // Create an intent with the action and the URI for Google Maps
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + locationToSearch);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

        // Set the package to ensure only the Google Maps app is opened
        mapIntent.setPackage("com.google.android.apps.maps");

        // Check if the Google Maps app is installed
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            // Start the activity
            startActivity(mapIntent);
        } else {
            // If Google Maps app is not installed, you can open the browser
            // with the Google Maps website or prompt the user to install the app.
            // For simplicity, we'll just log a message in this example.
            // You can customize this part based on your app's requirements.
             Log.d("MainActivity", "Google Maps app not installed");
        }
    }

    private void showAlertDialog(Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Data Loading..."); // Set your loading message
        progressDialog.setCancelable(false);
        progressDialog.show();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                progressDialog.dismiss();
            }
        },5000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}