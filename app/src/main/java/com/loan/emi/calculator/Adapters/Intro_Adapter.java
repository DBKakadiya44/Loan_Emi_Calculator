package com.loan.emi.calculator.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.loan.emi.calculator.ADS.Native;
import com.loan.emi.calculator.Activitys.IntroActivity;
import com.loan.emi.calculator.R;


public class Intro_Adapter extends PagerAdapter
{
    IntroActivity introActivity;

    public Intro_Adapter(IntroActivity introActivity) {
        this.introActivity = introActivity;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = LayoutInflater.from(introActivity).inflate(R.layout.item_intro,container,false);
        container.addView(view);

        TextView title = view.findViewById(R.id.tvtitle);
        TextView title2 = view.findViewById(R.id.textView2);
        TextView desc = view.findViewById(R.id.tvDesc);
        ImageView image = view.findViewById(R.id.imageView12);

        if(position==0)
        {
            title.setText("Welcome to EMI Calculator");
            title2.setText("Loan EMI Calculator");
            desc.setText("Installment Without Credit Card, Busy\n" +
                    "Now, Pay later");
            image.setImageResource(R.drawable.in1);

        }
        else if(position==1)
        {
            title.setText("");
            title2.setText("Calculate History");
            desc.setText("Swipe left for Standard mode, Swipe right\n" +
                    "for other Operators");
            image.setImageResource(R.drawable.in2);

        }
        else if (position==2)
        {
            title.setText("");
            title2.setText("EMI Calculator");
            desc.setText("Calculator Provides advanced mathematical\n" +
                    "function and beautifully designed");
            image.setImageResource(R.drawable.in3);

        }
        else if (position==3)
        {
            title.setText("");
            title2.setText("Mutual Fund & SIP");
            desc.setText("Share Calculation details Calculated by\n" +
                    "Mutual Fund Calculator and SIP Calculation");
            image.setImageResource(R.drawable.in4);

        }

        return view;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view = (View) object;
        container.removeView(view);
    }
}
