package com.withings.tutorials.ui.deprecated;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i0;
import androidx.viewpager.widget.ViewPager;
import com.withings.android.activity.WithingsActivity;
import com.withings.views.widget.InkPageIndicator;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
@Deprecated
/* loaded from: classes4.dex */
public class TutorialActivity extends WithingsActivity implements View.OnClickListener, ViewPager.h {

    /* renamed from: a  reason: collision with root package name */
    private String f44720a;

    /* renamed from: b  reason: collision with root package name */
    private String f44721b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<TutorialData> f44722c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f44723d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f44724e;

    /* renamed from: f  reason: collision with root package name */
    private String f44725f;

    /* renamed from: g  reason: collision with root package name */
    private String f44726g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f44727h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f44728i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f44729j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f44730k;

    /* renamed from: l  reason: collision with root package name */
    private ViewPager f44731l;

    /* renamed from: m  reason: collision with root package name */
    private ViewGroup f44732m;

    /* renamed from: n  reason: collision with root package name */
    private ViewGroup f44733n;

    /* renamed from: o  reason: collision with root package name */
    private InkPageIndicator f44734o;

    /* loaded from: classes4.dex */
    private class a extends i0 {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<TutorialData> f44735a;

        @Override // androidx.viewpager.widget.e
        public final int getCount() {
            return this.f44735a.size();
        }

        @Override // androidx.fragment.app.i0
        public final Fragment getItem(int i11) {
            z60.a aVar = new z60.a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_data", this.f44735a.get(i11));
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    private void A3() {
        boolean z5 = true;
        int i11 = 0;
        if (this.f44731l.getCurrentItem() != this.f44731l.getAdapter().getCount() - 1) {
            z5 = false;
        }
        if (z5) {
            this.f44727h.setText(this.f44720a);
        } else {
            this.f44727h.setText(C1987R.string._NEXT_);
        }
        TextView textView = this.f44728i;
        if (z5 && this.f44724e) {
            i11 = 8;
        }
        textView.setVisibility(i11);
    }

    public static Intent z3(Context context, ArrayList arrayList, String str, String str2) {
        return new Intent(context, TutorialActivity.class).putExtra("extra_data", new ArrayList(arrayList)).putExtra("extra_button_left_title", str).putExtra("extra_button_right_title", str2).putExtra("extra_hide_skip", true);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f44731l.getCurrentItem() == 0) {
            setResult(0);
            finish();
            return;
        }
        ViewPager viewPager = this.f44731l;
        viewPager.D(viewPager.getCurrentItem() - 1, true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == C1987R.id.button_next) {
            if (this.f44731l.getCurrentItem() == this.f44731l.getAdapter().getCount() - 1) {
                setResult(100);
                finish();
                return;
            }
            ViewPager viewPager = this.f44731l;
            viewPager.D(viewPager.getCurrentItem() + 1, true);
        } else if (id2 == C1987R.id.button_skip) {
            setResult(400);
            finish();
        } else if (id2 == C1987R.id.left_blocking_button) {
            setResult(200);
            finish();
        } else if (id2 == C1987R.id.right_blocking_button) {
            setResult(300);
            finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.fragment.app.i0, com.withings.tutorials.ui.deprecated.TutorialActivity$a, androidx.viewpager.widget.e] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z5;
        int i11;
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_tutorial_template);
        getWindow().setStatusBarColor(-1);
        this.f44722c = getIntent().getParcelableArrayListExtra("extra_data");
        this.f44720a = getIntent().getStringExtra("extra_button_right_title");
        this.f44721b = getIntent().getStringExtra("extra_button_left_title");
        this.f44725f = getIntent().getStringExtra("extra_blocking_left_text");
        this.f44726g = getIntent().getStringExtra("extra_blocking_right_text");
        this.f44724e = getIntent().getBooleanExtra("extra_hide_skip", true);
        int i12 = 0;
        if (this.f44725f != null && this.f44726g != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f44723d = z5;
        this.f44727h = (TextView) findViewById(C1987R.id.button_next);
        this.f44728i = (TextView) findViewById(C1987R.id.button_skip);
        this.f44729j = (TextView) findViewById(C1987R.id.left_blocking_button);
        this.f44730k = (TextView) findViewById(C1987R.id.right_blocking_button);
        this.f44731l = (ViewPager) findViewById(C1987R.id.pager);
        this.f44733n = (ViewGroup) findViewById(C1987R.id.layout_page_indicator);
        this.f44732m = (ViewGroup) findViewById(C1987R.id.blocking_workflowbar);
        this.f44734o = (InkPageIndicator) findViewById(C1987R.id.indicator);
        this.f44727h.setOnClickListener(this);
        this.f44728i.setOnClickListener(this);
        this.f44729j.setOnClickListener(this);
        this.f44730k.setOnClickListener(this);
        InkPageIndicator inkPageIndicator = this.f44734o;
        if (this.f44722c.size() > 1) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        inkPageIndicator.setVisibility(i11);
        ViewPager viewPager = this.f44731l;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        ArrayList<TutorialData> arrayList = this.f44722c;
        ?? i0Var = new i0(supportFragmentManager);
        i0Var.f44735a = arrayList;
        viewPager.setAdapter(i0Var);
        this.f44734o.setViewPager(this.f44731l);
        this.f44731l.c(this);
        if (this.f44723d) {
            this.f44729j.setText(this.f44725f);
            this.f44730k.setText(this.f44726g);
            this.f44732m.setVisibility(0);
            ViewGroup viewGroup = this.f44733n;
            if (this.f44722c.size() <= 1) {
                i12 = 8;
            }
            viewGroup.setVisibility(i12);
        } else {
            this.f44732m.setVisibility(8);
            this.f44727h.setText(this.f44720a);
            String str = this.f44721b;
            if (str != null) {
                this.f44728i.setText(str);
                this.f44728i.setVisibility(0);
            }
        }
        A3();
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        A3();
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrollStateChanged(int i11) {
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrolled(int i11, float f11, int i12) {
    }
}
