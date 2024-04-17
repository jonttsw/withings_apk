package com.withings.wiscale2.device.wpm.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.tutorials.ui.deprecated.TutorialActivity;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import tb0.k3;
/* compiled from: Wpm02StartFragment.java */
/* loaded from: classes5.dex */
public class k0 extends Fragment {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f55760o = 0;

    /* renamed from: c  reason: collision with root package name */
    private a f55761c;

    /* renamed from: d  reason: collision with root package name */
    private User f55762d;

    /* renamed from: e  reason: collision with root package name */
    private int f55763e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f55764f;

    /* renamed from: g  reason: collision with root package name */
    private int f55765g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f55766h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f55767i = new androidx.constraintlayout.widget.b();

    /* renamed from: j  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f55768j = new androidx.constraintlayout.widget.b();

    /* renamed from: k  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f55769k = new androidx.constraintlayout.widget.b();

    /* renamed from: l  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f55770l = new androidx.constraintlayout.widget.b();

    /* renamed from: m  reason: collision with root package name */
    private k3 f55771m;

    /* renamed from: n  reason: collision with root package name */
    private ProgressDialog f55772n;

    /* compiled from: Wpm02StartFragment.java */
    /* loaded from: classes5.dex */
    public interface a {
        void d();

        void f();

        void p0();

        void z0(int i11);
    }

    public static void s1(k0 k0Var, boolean z5) {
        androidx.constraintlayout.widget.b bVar;
        androidx.constraintlayout.widget.b bVar2;
        k3 k3Var = k0Var.f55771m;
        if (k3Var != null) {
            k0Var.f55764f = !z5;
            if (k0Var.f55762d == null) {
                k0Var.f55765g = 30;
                k3Var.f99283h.setChecked(true);
            }
            androidx.transition.w.a(k0Var.f55771m.a(), null);
            if (z5) {
                bVar = k0Var.f55768j;
            } else {
                bVar = k0Var.f55767i;
            }
            bVar.e(k0Var.f55771m.a());
            if (z5) {
                bVar2 = k0Var.f55770l;
            } else {
                bVar2 = k0Var.f55769k;
            }
            bVar2.e(k0Var.f55771m.f99278c);
            User user = k0Var.f55762d;
            boolean z11 = k0Var.f55764f;
            if (user != null) {
                SharedPreferences.Editor edit = k0Var.v1().edit();
                edit.putBoolean("mode_" + user.q(), z11).apply();
            }
        }
    }

    public static void t1(k0 k0Var) {
        User user = k0Var.f55762d;
        if (user != null) {
            SharedPreferences v12 = k0Var.v1();
            if (v12.getBoolean("shownTutorial_" + user.q(), false)) {
                k0Var.f55766h = false;
                if (k0Var.f55764f) {
                    k0Var.f55761c.f();
                    return;
                } else {
                    k0Var.f55761c.z0(k0Var.f55765g);
                    return;
                }
            }
        }
        k0Var.f55766h = true;
        k0Var.y1();
    }

    public static void u1(k0 k0Var) {
        a aVar = k0Var.f55761c;
        if (aVar != null) {
            aVar.p0();
        }
    }

    private SharedPreferences v1() {
        return getContext().getSharedPreferences("Wpm02Start", 0);
    }

    private void y1() {
        startActivityForResult(TutorialActivity.z3(getContext(), we0.k.a(this.f55763e, requireContext()), getString(C1987R.string._SKIP_), getString(C1987R.string._OK_)), ConstantsWs.WS_STATUS_WRONGOFFSET);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 242 && this.f55766h && i12 != 0) {
            User user = this.f55762d;
            if (user != null) {
                SharedPreferences.Editor edit = v1().edit();
                edit.putBoolean("shownTutorial_" + user.q(), true).apply();
            }
            if (this.f55764f) {
                this.f55761c.f();
            } else {
                this.f55761c.z0(this.f55765g);
            }
            this.f55766h = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f55761c = (a) context;
        } catch (Exception unused) {
            throw new ClassCastException(getClass().getSimpleName() + " must implement " + a.class.getName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f55763e = getArguments().getInt("deviceModelId");
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1987R.menu.wpm02_start, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k3 b10 = k3.b(layoutInflater, viewGroup);
        this.f55771m = b10;
        return b10.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f55772n.dismiss();
        this.f55771m = null;
        super.onDestroyView();
    }

    public void onEventMainThread(xe0.e eVar) {
        w1(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C1987R.id.action_about) {
            y1();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        jk0.c.b().g(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        jk0.c.b().f(this);
        this.f55761c.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z5;
        boolean z11;
        boolean z12;
        boolean z13;
        String substring;
        super.onViewCreated(view, bundle);
        k3 k3Var = this.f55771m;
        if (k3Var != null) {
            ConstraintLayout a11 = k3Var.a();
            androidx.constraintlayout.widget.b bVar = this.f55767i;
            bVar.k(a11);
            this.f55768j.l(bVar);
            ConstraintLayout constraintLayout = this.f55771m.f99278c;
            androidx.constraintlayout.widget.b bVar2 = this.f55769k;
            bVar2.k(constraintLayout);
            androidx.constraintlayout.widget.b bVar3 = this.f55770l;
            bVar3.l(bVar2);
            bVar3.j(C1987R.id.advanced_switch, 4);
            bVar3.n(C1987R.id.advanced_switch, 1, 0, 1);
            bVar3.n(C1987R.id.advanced_switch, 2, 0, 2);
            bVar3.n(C1987R.id.thirty_sec, 3, C1987R.id.advanced_switch, 4);
            bVar3.n(C1987R.id.advanced_information, 4, 0, 4);
        }
        this.f55761c.d();
        User user = (User) getArguments().getParcelable("currentUser");
        k3 k3Var2 = this.f55771m;
        if (k3Var2 != null) {
            this.f55762d = user;
            if (user != null) {
                this.f55764f = v1().getBoolean("mode_" + user.q(), true);
                this.f55765g = v1().getInt("timeBetweenMeasurement_" + user.q(), 30);
                if (TextUtils.isEmpty(user.s())) {
                    substring = "";
                } else {
                    substring = user.s().substring(0, 1);
                }
                this.f55771m.f99279d.setValue(user.l() + " " + substring);
            } else {
                this.f55764f = true;
                k3Var2.f99279d.setValue(getString(C1987R.string._BPV2_GUEST_));
            }
        }
        k3 k3Var3 = this.f55771m;
        if (k3Var3 != null) {
            k3Var3.f99282g.setEnabled(false);
            this.f55771m.f99282g.setOnClickListener(new com.google.android.material.search.j(this, 12));
            this.f55771m.f99279d.setOnClickListener(new com.google.android.material.search.k(this, 13));
            this.f55771m.f99277b.setChecked(!this.f55764f);
            this.f55771m.f99277b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.withings.wiscale2.device.wpm.ui.j0
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                    k0.s1(k0.this, z14);
                }
            });
            CheckedTextView checkedTextView = this.f55771m.f99283h;
            if (this.f55765g == 30) {
                z5 = true;
            } else {
                z5 = false;
            }
            checkedTextView.setChecked(z5);
            CheckedTextView checkedTextView2 = this.f55771m.f99281f;
            if (this.f55765g == 60) {
                z11 = true;
            } else {
                z11 = false;
            }
            checkedTextView2.setChecked(z11);
            CheckedTextView checkedTextView3 = this.f55771m.f99280e;
            if (this.f55765g == 90) {
                z12 = true;
            } else {
                z12 = false;
            }
            checkedTextView3.setChecked(z12);
            CheckedTextView checkedTextView4 = this.f55771m.f99284i;
            if (this.f55765g == 120) {
                z13 = true;
            } else {
                z13 = false;
            }
            checkedTextView4.setChecked(z13);
            this.f55771m.f99283h.setOnClickListener(new sg.g(this, 13));
            this.f55771m.f99281f.setOnClickListener(new dq.a(this, 6));
            this.f55771m.f99280e.setOnClickListener(new gi.e(this, 7));
            this.f55771m.f99284i.setOnClickListener(new gi.f(this, 15));
            this.f55772n = ProgressDialog.show(getActivity(), null, getString(C1987R.string._LOADING_), true, false);
        }
    }

    public final void w1(boolean z5) {
        k3 k3Var = this.f55771m;
        if (k3Var != null) {
            k3Var.f99282g.setEnabled(z5);
        }
        ProgressDialog progressDialog = this.f55772n;
        if (progressDialog != null && progressDialog.isShowing() && z5) {
            this.f55772n.dismiss();
        }
    }

    public final void x1(int i11, int i12) {
        boolean z5;
        boolean z11;
        boolean z12;
        User user;
        k3 k3Var = this.f55771m;
        if (k3Var != null) {
            CheckedTextView checkedTextView = k3Var.f99283h;
            boolean z13 = false;
            if (i11 == checkedTextView.getId()) {
                z5 = true;
            } else {
                z5 = false;
            }
            checkedTextView.setChecked(z5);
            CheckedTextView checkedTextView2 = this.f55771m.f99281f;
            if (i11 == checkedTextView2.getId()) {
                z11 = true;
            } else {
                z11 = false;
            }
            checkedTextView2.setChecked(z11);
            CheckedTextView checkedTextView3 = this.f55771m.f99280e;
            if (i11 == checkedTextView3.getId()) {
                z12 = true;
            } else {
                z12 = false;
            }
            checkedTextView3.setChecked(z12);
            CheckedTextView checkedTextView4 = this.f55771m.f99284i;
            if (i11 == checkedTextView4.getId()) {
                z13 = true;
            }
            checkedTextView4.setChecked(z13);
            this.f55765g = i12;
            if (this.f55762d != null) {
                v1().edit().putInt("timeBetweenMeasurement_" + user.q(), i12).apply();
            }
        }
    }
}
