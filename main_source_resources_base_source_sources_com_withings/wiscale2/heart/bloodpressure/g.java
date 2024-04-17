package com.withings.wiscale2.heart.bloodpressure;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.g6;
import androidx.compose.material3.k4;
import com.withings.bloodpressure.core.BloodPressureCategory;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.measure.detail.ui.views.AddDetailsView;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.views.view.HorizontalScaleView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.heart.HeartHistoryActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import jm.a;
import org.joda.time.DateTime;
import tb0.w1;
/* compiled from: BloodPressureDetailFragment.java */
/* loaded from: classes5.dex */
public class g extends k0 {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f57367r = 0;

    /* renamed from: h  reason: collision with root package name */
    private w1 f57368h;

    /* renamed from: i  reason: collision with root package name */
    private User f57369i;

    /* renamed from: j  reason: collision with root package name */
    private a f57370j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f57371k;

    /* renamed from: l  reason: collision with root package name */
    private MeasuresGroup f57372l;

    /* renamed from: m  reason: collision with root package name */
    private Measure f57373m;

    /* renamed from: n  reason: collision with root package name */
    private Measure f57374n;

    /* renamed from: o  reason: collision with root package name */
    private Measure f57375o;
    @Inject

    /* renamed from: p  reason: collision with root package name */
    fy.z f57376p;
    @Inject

    /* renamed from: q  reason: collision with root package name */
    zx.r f57377q;

    /* compiled from: BloodPressureDetailFragment.java */
    /* loaded from: classes5.dex */
    public interface a {
        void W2(MeasuresGroup measuresGroup);
    }

    public static void t1(g gVar, View view) {
        DateTime dateTime = new DateTime(gVar.f57372l.getDate());
        Context context = view.getContext();
        User user = gVar.f57369i;
        Period period = Period.f43723h;
        HeartHistoryActivity.f57022w.getClass();
        gVar.startActivity(HeartHistoryActivity.a.a(context, user, dateTime, period));
    }

    public static void u1(final g gVar, String str) {
        gVar.f57368h.f99582e.setText(str);
        gVar.f57372l.setComment(str);
        vh.h.h().a(new vh.a() { // from class: com.withings.wiscale2.heart.bloodpressure.e
            @Override // vh.a
            public final void run() {
                r0.f57376p.a(r0.f57369i.q(), hy.g.a(g.this.f57372l));
            }
        }).q(new f(gVar));
    }

    private ArrayList v1(int i11, ArrayList arrayList) {
        double b10;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i12 = 0;
        int i13 = 1;
        while (i13 < size) {
            BloodPressureCategory bloodPressureCategory = (BloodPressureCategory) arrayList.get(i13);
            BloodPressureCategory bloodPressureCategory2 = (BloodPressureCategory) arrayList.get(i13 - 1);
            BloodPressureCategory.l lVar = (BloodPressureCategory.l) bloodPressureCategory2.c();
            if (i11 == 10) {
                b10 = lVar.c();
            } else {
                b10 = lVar.b();
            }
            int i14 = ((int) b10) + 1;
            arrayList2.add(new HorizontalScaleView.f("", i14 - i12, androidx.core.content.a.getColor(requireContext(), fi.a.b(bloodPressureCategory2))));
            if (i13 == size - 1) {
                arrayList2.add(new HorizontalScaleView.f("", (int) (i14 + ((HorizontalScaleView.f) androidx.appcompat.view.menu.d.d(arrayList2, 1)).f46628a), androidx.core.content.a.getColor(requireContext(), fi.a.b(bloodPressureCategory))));
            }
            i13++;
            i12 = i14;
        }
        return arrayList2;
    }

    @Override // com.withings.wiscale2.heart.bloodpressure.k0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.f57370j = (a) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(context.getClass().getSimpleName() + " must implement " + a.class.getName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        this.f57372l = (MeasuresGroup) getArguments().getSerializable("EXTRA_MEASUREGROUP");
        this.f57371k = getArguments().getBoolean("extra_show_trend_button", false);
        this.f57369i = (User) getArguments().getParcelable(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (!this.f57369i.D()) {
            menuInflater.inflate(C1987R.menu.blood_pressure_detail, menu);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        w1 b10 = w1.b(layoutInflater, viewGroup);
        this.f57368h = b10;
        return b10.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f57368h = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C1987R.id.action_share) {
            jm.a a11 = a.d.a(requireContext());
            Context requireContext = requireContext();
            String b10 = a11.b(this.f57373m.f95794y, 10);
            String b11 = a11.b(this.f57374n.f95794y, 9);
            String b12 = a11.b(this.f57375o.f95794y, 11);
            StringBuilder c11 = k4.c(g6.i(requireContext.getString(C1987R.string._NEWSFEED_SOCIAL_BLOOD_PRESSURE__s_, w6.o.a(b10, " / ", b11)), " "));
            c11.append(requireContext.getString(C1987R.string._NEWSFEED_SOCIAL_BLOOD_PRESSURE_PULSE__s_, b12));
            String sb2 = c11.toString();
            x70.b.r(ConstantsWs.JSON_SESSION_KEY_GCONST, androidx.activity.a0.b("About to share the following message : ", sb2), new Object[0]);
            u70.e.e(requireActivity(), sb2);
            return true;
        } else if (menuItem.getItemId() == C1987R.id.action_delete) {
            this.f57370j.W2(this.f57372l);
            return true;
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.function.ToIntFunction, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        String str;
        super.onStart();
        if (this.f57372l != null) {
            this.f57368h.f99585h.setVisibility(8);
            this.f57368h.f99585h.setVisibility(8);
            this.f57373m = this.f57372l.getMeasureForType(10);
            this.f57374n = this.f57372l.getMeasureForType(9);
            this.f57375o = this.f57372l.getMeasureForType(11);
            Context context = this.f57368h.f99588k.getContext();
            jm.a a11 = a.d.a(context);
            this.f57368h.f99588k.setValue(a11.b(this.f57373m.f95794y, 10));
            this.f57368h.f99583f.setValue(a11.b(this.f57374n.f95794y, 9));
            Measure measure = this.f57375o;
            if (measure != null) {
                this.f57368h.f99584g.setValue(a11.f(measure.f95794y, 11));
                this.f57368h.f99584g.setVisibility(0);
            } else {
                this.f57368h.f99584g.setVisibility(8);
            }
            String country = Locale.getDefault().getCountry();
            BloodPressureCategory a12 = j0.a(this.f57372l, country);
            this.f57368h.f99579b.setText(context.getString(fi.a.c(a12)));
            this.f57368h.f99579b.setCompoundDrawablesWithIntrinsicBounds(y70.a.a(C1987R.drawable.blood_pressure_result_circle, context, fi.a.b(a12)), (Drawable) null, y70.a.c(C1987R.drawable.ic_arrow_right_30dp, context, ah.u.v(C1987R.attr.colorOnSurface, context)), (Drawable) null);
            AddDetailsView addDetailsView = this.f57368h.f99582e;
            if (this.f57372l.getComment() != null) {
                str = this.f57372l.getComment();
            } else {
                str = "";
            }
            addDetailsView.setText(str);
            this.f57368h.f99582e.setTypes(this.f57372l.getAllMeasuresTypes().stream().mapToInt(new Object()).toArray());
            int i11 = BloodPressureCategory.f32883e;
            BloodPressureCategory[] b10 = BloodPressureCategory.a.b(country);
            m6.v vVar = new m6.v(7);
            List asList = Arrays.asList(b10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : asList) {
                if (((BloodPressureCategory) obj).c() instanceof BloodPressureCategory.l) {
                    arrayList.add(obj);
                }
            }
            BloodPressureCategory.Status d11 = j0.a(this.f57372l, Locale.getDefault().getCountry()).d();
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (((BloodPressureCategory) arrayList.get(size)).d() == d11) {
                    this.f57368h.f99580c.setColorPartTillPartPosition(size);
                    break;
                } else {
                    size--;
                }
            }
            this.f57368h.f99580c.setScale(new HorizontalScaleView.e(getString(C1987R.string._BP_SYS_), v1(10, arrayList)));
            this.f57368h.f99580c.setCursorValue((int) this.f57373m.f95794y);
            this.f57368h.f99580c.setDelegate(vVar);
            this.f57368h.f99580c.setSecondaryScale(new HorizontalScaleView.e(getString(C1987R.string._BP_DIA_), v1(9, arrayList)));
            this.f57368h.f99580c.setSecondaryCursorValue((int) this.f57374n.f95794y);
            this.f57368h.f99580c.setSecondaryDelegate(vVar);
            this.f57368h.f99580c.n();
            return;
        }
        throw new IllegalArgumentException("You should have specified a measureGroup or a measureGroupId");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z5;
        int i11;
        super.onViewCreated(view, bundle);
        this.f57368h.f99581d.setBrandName(wy.a.b(view.getContext(), this.f57372l));
        int i12 = 0;
        if (this.f57372l.getAttrib() == 5) {
            z5 = true;
        } else {
            z5 = false;
        }
        LineCellView lineCellView = this.f57368h.f99589l;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        lineCellView.setVisibility(i11);
        if (this.f57369i.D()) {
            this.f57368h.f99582e.setVisibility(8);
        } else {
            this.f57368h.f99582e.setListener(new AddDetailsView.a() { // from class: com.withings.wiscale2.heart.bloodpressure.d
                @Override // com.withings.measure.detail.ui.views.AddDetailsView.a
                public final void a(String str) {
                    g.u1(g.this, str);
                }
            });
        }
        this.f57368h.f99587j.setOnClickListener(new sg.b(this, 16));
        LineCellView lineCellView2 = this.f57368h.f99586i;
        if (!this.f57371k) {
            i12 = 8;
        }
        lineCellView2.setVisibility(i12);
        this.f57368h.f99586i.setOnClickListener(new sg.c(this, 14));
    }
}
