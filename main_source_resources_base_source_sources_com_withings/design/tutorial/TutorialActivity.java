package com.withings.design.tutorial;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i0;
import androidx.viewpager.widget.ViewPager;
import com.withings.design.view.InkPageIndicator;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class TutorialActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.h {

    /* renamed from: a  reason: collision with root package name */
    private String f36132a;

    /* renamed from: b  reason: collision with root package name */
    private String f36133b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<TutorialData> f36134c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f36135d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36136e;

    /* renamed from: f  reason: collision with root package name */
    private String f36137f;

    /* renamed from: g  reason: collision with root package name */
    private String f36138g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f36139h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f36140i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f36141j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f36142k;

    /* renamed from: l  reason: collision with root package name */
    private ViewPager f36143l;

    /* renamed from: m  reason: collision with root package name */
    private ViewGroup f36144m;

    /* renamed from: n  reason: collision with root package name */
    private ViewGroup f36145n;

    /* renamed from: o  reason: collision with root package name */
    private InkPageIndicator f36146o;

    /* loaded from: classes3.dex */
    private class a extends i0 {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<TutorialData> f36147a;

        @Override // androidx.viewpager.widget.e
        public final int getCount() {
            return this.f36147a.size();
        }

        @Override // androidx.fragment.app.i0
        public final Fragment getItem(int i11) {
            jn.a aVar = new jn.a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_data", this.f36147a.get(i11));
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    private void z3() {
        boolean z5 = true;
        int i11 = 0;
        if (this.f36143l.getCurrentItem() != this.f36143l.getAdapter().getCount() - 1) {
            z5 = false;
        }
        if (z5) {
            this.f36139h.setText(this.f36132a);
        } else {
            this.f36139h.setText(C1987R.string._NEXT_);
        }
        TextView textView = this.f36140i;
        if (z5 && this.f36136e) {
            i11 = 8;
        }
        textView.setVisibility(i11);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.f36143l.getCurrentItem() == 0) {
            setResult(0);
            finish();
            return;
        }
        ViewPager viewPager = this.f36143l;
        viewPager.D(viewPager.getCurrentItem() - 1, true);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == C1987R.id.button_next) {
            if (this.f36143l.getCurrentItem() == this.f36143l.getAdapter().getCount() - 1) {
                setResult(100);
                finish();
                return;
            }
            ViewPager viewPager = this.f36143l;
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
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.fragment.app.i0, com.withings.design.tutorial.TutorialActivity$a, androidx.viewpager.widget.e] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z5;
        int i11;
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_tutorial_template);
        getWindow().setStatusBarColor(-1);
        this.f36134c = getIntent().getParcelableArrayListExtra("extra_data");
        this.f36132a = getIntent().getStringExtra("extra_button_right_title");
        this.f36133b = getIntent().getStringExtra("extra_button_left_title");
        this.f36137f = getIntent().getStringExtra("extra_blocking_left_text");
        this.f36138g = getIntent().getStringExtra("extra_blocking_right_text");
        this.f36136e = getIntent().getBooleanExtra("extra_hide_skip", true);
        int i12 = 0;
        if (this.f36137f != null && this.f36138g != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f36135d = z5;
        this.f36139h = (TextView) findViewById(C1987R.id.button_next);
        this.f36140i = (TextView) findViewById(C1987R.id.button_skip);
        this.f36141j = (TextView) findViewById(C1987R.id.left_blocking_button);
        this.f36142k = (TextView) findViewById(C1987R.id.right_blocking_button);
        this.f36143l = (ViewPager) findViewById(C1987R.id.pager);
        this.f36145n = (ViewGroup) findViewById(C1987R.id.layout_page_indicator);
        this.f36144m = (ViewGroup) findViewById(C1987R.id.blocking_workflowbar);
        this.f36146o = (InkPageIndicator) findViewById(C1987R.id.indicator);
        this.f36139h.setOnClickListener(this);
        this.f36140i.setOnClickListener(this);
        this.f36141j.setOnClickListener(this);
        this.f36142k.setOnClickListener(this);
        InkPageIndicator inkPageIndicator = this.f36146o;
        if (this.f36134c.size() > 1) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        inkPageIndicator.setVisibility(i11);
        ViewPager viewPager = this.f36143l;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        ArrayList<TutorialData> arrayList = this.f36134c;
        ?? i0Var = new i0(supportFragmentManager);
        i0Var.f36147a = arrayList;
        viewPager.setAdapter(i0Var);
        this.f36146o.setViewPager(this.f36143l);
        this.f36143l.c(this);
        if (this.f36135d) {
            this.f36141j.setText(this.f36137f);
            this.f36142k.setText(this.f36138g);
            this.f36144m.setVisibility(0);
            ViewGroup viewGroup = this.f36145n;
            if (this.f36134c.size() <= 1) {
                i12 = 8;
            }
            viewGroup.setVisibility(i12);
        } else {
            this.f36144m.setVisibility(8);
            this.f36139h.setText(this.f36132a);
            String str = this.f36133b;
            if (str != null) {
                this.f36140i.setText(str);
                this.f36140i.setVisibility(0);
            }
        }
        z3();
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        z3();
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrollStateChanged(int i11) {
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrolled(int i11, float f11, int i12) {
    }
}
