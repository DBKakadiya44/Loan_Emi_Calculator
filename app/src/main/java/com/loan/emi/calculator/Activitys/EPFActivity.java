package com.loan.emi.calculator.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.loan.emi.calculator.ADS.AdsManager;
import com.loan.emi.calculator.ADS.InterstitialAD;
import com.loan.emi.calculator.ADS.Native;
import com.loan.emi.calculator.MainActivity;
import com.loan.emi.calculator.R;
import com.loan.emi.calculator.databinding.ActivityEpfactivityBinding;

public class EPFActivity extends AppCompatActivity {
    ActivityEpfactivityBinding binding;
    InterstitialAD helper;
    AdsManager adsManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEpfactivityBinding.inflate(getLayoutInflater());
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

        binding.epf1.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 28);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 28);
                    startActivity(intent);
                }
            });
        });

        binding.epf2.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 29);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 29);
                    startActivity(intent);
                }
            });
        });

        binding.epf3.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 30);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 30);
                    startActivity(intent);
                }
            });
        });

        binding.epf4.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 31);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 31);
                    startActivity(intent);
                }
            });
        });

        binding.epf5.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 32);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 32);
                    startActivity(intent);
                }
            });
        });

        binding.epf6.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 33);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 33);
                    startActivity(intent);
                }
            });
        });

        binding.epf7.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 34);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 34);
                    startActivity(intent);
                }
            });
        });

        binding.epf8.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 35);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 35);
                    startActivity(intent);
                }
            });
        });

        binding.epf9.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 36);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 36);
                    startActivity(intent);
                }
            });
        });

        binding.epf10.setOnClickListener(view -> {
            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 37);
                    startActivity(intent);
                }

                @Override
                public void onInterstitialDismissed() {
                    Intent intent = new Intent(EPFActivity.this, DetailPageActivity.class);
                    intent.putExtra("cnt", 37);
                    startActivity(intent);
                }
            });
        });

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