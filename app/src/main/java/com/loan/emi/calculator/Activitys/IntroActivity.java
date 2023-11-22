package com.loan.emi.calculator.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.Toast;

import com.loan.emi.calculator.ADS.AdsManager;
import com.loan.emi.calculator.ADS.InterstitialAD;
import com.loan.emi.calculator.ADS.Native;
import com.loan.emi.calculator.Adapters.Intro_Adapter;
import com.loan.emi.calculator.MainActivity;
import com.loan.emi.calculator.R;
import com.loan.emi.calculator.databinding.ActivityIntroBinding;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class IntroActivity extends AppCompatActivity {
    ActivityIntroBinding binding;
    InterstitialAD helper;
    AdsManager adsManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Window window = this.getWindow();
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.maincolor));

        showAlertDialog(this);

        Native aNative = new Native(this);
        aNative.ShowNative(this, findViewById(R.id.native_container5),3);

        DotsIndicator dotsIndicator = findViewById(R.id.dots_indicator);
        ViewPager viewPager = findViewById(R.id.viewPager);
        Intro_Adapter pagerAdapter = new Intro_Adapter(IntroActivity.this);
        viewPager.setAdapter(pagerAdapter);
        dotsIndicator.attachTo(viewPager);

        adsManager = new AdsManager(this);
        helper = new InterstitialAD(this,this,adsManager);

        binding.ivNext.setOnClickListener(v -> {

            helper.showCounterInterstitialAd(new InterstitialAD.AdLoadListeners() {
                @Override
                public void onAdLoadFailed() {
                    int position = binding.viewPager.getCurrentItem();
                    position++;
                    binding.viewPager.setCurrentItem(position);

                    if(position==4){
                        startActivity(new Intent(IntroActivity.this , MainActivity.class));
                    }
                }

                @Override
                public void onInterstitialDismissed() {
                    int position = binding.viewPager.getCurrentItem();
                    position++;
                    binding.viewPager.setCurrentItem(position);

                    if(position==4){
                        startActivity(new Intent(IntroActivity.this , MainActivity.class));
                    }
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