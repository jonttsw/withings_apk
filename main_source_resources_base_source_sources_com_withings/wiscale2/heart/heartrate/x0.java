package com.withings.wiscale2.heart.heartrate;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.heartrate.core.HeartRateDiagnostic;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.measure.detail.ui.views.AddDetailsView;
import com.withings.user.User;
import com.withings.views.measure.detail.ui.views.BrandView;
import com.withings.views.measure.detail.ui.views.DataView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.measure.list.MeasureListActivity;
import javax.inject.Inject;
import jm.a;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: HeartRateDetailFragment.java */
/* loaded from: classes5.dex */
public class x0 extends i1 {

    /* renamed from: t */
    public static final /* synthetic */ int f57761t = 0;

    /* renamed from: h */
    private DataView f57762h;

    /* renamed from: i */
    private LineCellView f57763i;

    /* renamed from: j */
    private LineCellView f57764j;

    /* renamed from: k */
    private AddDetailsView f57765k;

    /* renamed from: l */
    private ProgressBar f57766l;

    /* renamed from: m */
    private User f57767m;

    /* renamed from: n */
    private MeasuresGroup f57768n;

    /* renamed from: o */
    private Measure f57769o;

    /* renamed from: p */
    private Measure f57770p;

    /* renamed from: q */
    private boolean f57771q;
    @Inject

    /* renamed from: r */
    fy.c0 f57772r;
    @Inject

    /* renamed from: s */
    zx.r f57773s;

    public static /* synthetic */ void s1(x0 x0Var, androidx.appcompat.app.c cVar) {
        Context context = x0Var.f57765k.getContext();
        cVar.g(-2).setTextColor(ah.u.v(C1987R.attr.colorOnSurface, context));
        cVar.g(-1).setTextColor(ah.u.v(C1987R.attr.colorError, context));
    }

    public static void t1(x0 x0Var) {
        x0Var.getClass();
        sw.a z5 = sw.a.z();
        kotlin.jvm.internal.u.i(z5, "get(...)");
        zx.v vVar = new zx.v(z5);
        zx.j a11 = zx.j.f111082d.a();
        new fy.a(vVar, new fy.d(vVar, a11), new ey.a(new fy.x(new ey.b(vVar))), a11).b(hy.g.a(x0Var.f57768n));
        x0Var.f57773s.run();
        x0Var.requireActivity().finish();
    }

    public static void v1(x0 x0Var) {
        x0Var.startActivity(HMWebActivity.f35395c.c(x0Var.f57762h.getContext(), "", x0Var.getString(C1987R.string.heartRate_learnMore)));
    }

    public static void w1(x0 x0Var, String str) {
        x0Var.getClass();
        String trim = str.trim();
        x0Var.f57765k.setText(trim);
        if (!TextUtils.equals(x0Var.f57768n.getComment(), trim)) {
            x0Var.f57768n.setComment(trim);
            vh.h.h().a(new vh.a() { // from class: com.withings.wiscale2.heart.heartrate.u0
                @Override // vh.a
                public final void run() {
                    r0.f57772r.b(hy.g.a(x0.this.f57768n));
                }
            }).q(new w0(x0Var));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.f57768n = (MeasuresGroup) getArguments().getSerializable("EXTRA_MEASURE_GROUP");
        this.f57767m = (User) getArguments().getParcelable("EXTRA_USER");
        this.f57771q = getArguments().getBoolean("EXTRA_SHOULD_SHOW_LIST", false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1987R.menu.view_measure, menu);
        menu.findItem(C1987R.id.action_display_list).setVisible(this.f57771q);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1987R.layout.fragment_heartrate_detail, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [android.content.DialogInterface$OnClickListener, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C1987R.id.action_delete) {
            qc.b bVar = new qc.b(this.f57765k.getContext());
            bVar.C(C1987R.string._DELETE_TITLE_);
            bVar.g(C1987R.string._DELETE_MEASURE_CONFIRMATION_);
            bVar.t(false);
            androidx.appcompat.app.c create = bVar.z(C1987R.string._DELETE_YES_, new com.withings.reminder.details.a(this, 3)).w(C1987R.string._CANCEL_, new Object()).create();
            create.setOnShowListener(new com.withings.wiscale2.heart.bloodpressure.t(this, create, 1));
            create.show();
            return true;
        } else if (itemId == C1987R.id.action_share) {
            u70.e.e(requireActivity(), getString(C1987R.string._NEWSFEED_SOCIAL_BLOOD_PRESSURE_PULSE__s_, String.valueOf((int) this.f57768n.getMeasureForType(11).getValue())));
            return true;
        } else if (itemId == C1987R.id.action_display_list) {
            MeasureListActivity.f58492n.getClass();
            startActivity(MeasureListActivity.a.a(requireContext(), this.f57767m.q(), new int[]{11}, C1987R.string._HEART_RATE_));
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.function.ToIntFunction, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        CharSequence charSequence;
        int i11;
        super.onStart();
        if (this.f57768n != null) {
            this.f57766l.setVisibility(8);
            MeasuresGroup measuresGroup = this.f57768n;
            this.f57766l.setVisibility(8);
            this.f57768n = measuresGroup;
            this.f57769o = measuresGroup.getMeasureForType(11);
            this.f57770p = this.f57768n.getMeasureForType(54);
            jm.a a11 = a.d.a(this.f57762h.getContext());
            HeartRateDiagnostic l5 = ah.g.l((int) this.f57769o.f95794y);
            DataView dataView = this.f57762h;
            if (l5 != null) {
                charSequence = jm.a.c(a11, 11, this.f57769o.f95794y, 0, 0, 60);
            } else {
                charSequence = "--";
            }
            dataView.setValue(charSequence);
            this.f57765k.setTypes(this.f57768n.getAllMeasuresTypes().stream().mapToInt(new Object()).toArray());
            this.f57765k.setText(this.f57768n.getComment());
            if (this.f57770p != null) {
                this.f57763i.setVisibility(0);
                this.f57763i.setValue(jm.a.e(a11, (int) this.f57770p.f95794y, 0, 0, 30));
            }
            if (l5 != null) {
                LineCellView lineCellView = this.f57764j;
                int ordinal = l5.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            i11 = C1987R.string._FAST_HEART_RATE_DIAGNOSTIC_;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        i11 = C1987R.string._NORMAL_HEART_RATE_DIAGNOSTIC_;
                    }
                } else {
                    i11 = C1987R.string._SLOW_HEART_RATE_DIAGNOSTIC_;
                }
                lineCellView.setLabel(getString(i11));
            }
            this.f57764j.setOnClickListener(new androidx.viewpager.widget.d(this, 11));
            return;
        }
        throw new IllegalArgumentException("You should have specified a measureGroup");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57762h = (DataView) view.findViewById(C1987R.id.heartrate);
        this.f57763i = (LineCellView) view.findViewById(C1987R.id.spo2);
        this.f57764j = (LineCellView) view.findViewById(C1987R.id.textView_appreciation);
        this.f57765k = (AddDetailsView) view.findViewById(C1987R.id.comment);
        this.f57766l = (ProgressBar) view.findViewById(C1987R.id.progressBar);
        ((BrandView) view.findViewById(C1987R.id.brand_view)).setBrandName(wy.a.b(view.getContext(), this.f57768n));
        this.f57765k.setListener(new AddDetailsView.a() { // from class: com.withings.wiscale2.heart.heartrate.s0
            @Override // com.withings.measure.detail.ui.views.AddDetailsView.a
            public final void a(String str) {
                x0.w1(x0.this, str);
            }
        });
    }
}
