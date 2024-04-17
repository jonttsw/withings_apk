package com.withings.wiscale2.heart;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k0;
import androidx.viewpager.widget.ViewPager;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.heart.HeartDetailActivity;
import com.withings.wiscale2.heart.bloodpressure.g;
import com.withings.wiscale2.heart.heartrate.x0;
import fy.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import tb0.v;
/* loaded from: classes5.dex */
public class HeartDetailActivity extends r implements g.a, py.a {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f57003o = 0;

    /* renamed from: e  reason: collision with root package name */
    private User f57004e;

    /* renamed from: f  reason: collision with root package name */
    private MeasuresGroup f57005f;

    /* renamed from: g  reason: collision with root package name */
    private int f57006g;

    /* renamed from: h  reason: collision with root package name */
    private long f57007h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f57008i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f57009j = false;

    /* renamed from: k  reason: collision with root package name */
    private int f57010k;

    /* renamed from: l  reason: collision with root package name */
    private c f57011l;

    /* renamed from: m  reason: collision with root package name */
    private v f57012m;
    @Inject

    /* renamed from: n  reason: collision with root package name */
    public sw.a f57013n;

    /* loaded from: classes5.dex */
    final class a extends pm.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MeasuresGroup f57014a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(MeasuresGroup measuresGroup) {
            this.f57014a = measuresGroup;
        }

        @Override // vh.a.b
        public final void onResult() {
            Intent intent = new Intent();
            intent.putExtra("extra_measures_group", this.f57014a);
            HeartDetailActivity heartDetailActivity = HeartDetailActivity.this;
            heartDetailActivity.setResult(10, intent);
            heartDetailActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class b extends pm.h<List<MeasuresGroup>> {
        b() {
        }

        @Override // vh.m.b
        public final void onResult(Object obj) {
            HeartDetailActivity.C3(HeartDetailActivity.this, (List) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c extends k0 {

        /* renamed from: a  reason: collision with root package name */
        private List<MeasuresGroup> f57017a;

        /* renamed from: b  reason: collision with root package name */
        private final User f57018b;

        /* renamed from: c  reason: collision with root package name */
        private final int f57019c;

        /* renamed from: d  reason: collision with root package name */
        private final Context f57020d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f57021e;

        c(Context context, FragmentManager fragmentManager, User user, int i11, boolean z5) {
            super(fragmentManager);
            this.f57018b = user;
            this.f57019c = i11;
            this.f57020d = context;
            this.f57021e = z5;
        }

        public final void a(List<MeasuresGroup> list) {
            this.f57017a = list;
        }

        @Override // androidx.viewpager.widget.e
        public final int getCount() {
            List<MeasuresGroup> list = this.f57017a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public final DateTime getDate(int i11) {
            return new DateTime(this.f57017a.get(i11).getDate());
        }

        @Override // androidx.fragment.app.k0
        public final Fragment getItem(int i11) {
            boolean z5 = this.f57021e;
            User user = this.f57018b;
            int i12 = this.f57019c;
            if (i12 == 0) {
                com.withings.wiscale2.heart.bloodpressure.g gVar = new com.withings.wiscale2.heart.bloodpressure.g();
                Bundle bundle = new Bundle();
                bundle.putParcelable(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
                bundle.putSerializable("EXTRA_MEASUREGROUP", this.f57017a.get(i11));
                bundle.putBoolean("extra_show_trend_button", z5);
                gVar.setArguments(bundle);
                return gVar;
            } else if (i12 == 1) {
                x0 x0Var = new x0();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("EXTRA_USER", user);
                bundle2.putSerializable("EXTRA_MEASURE_GROUP", this.f57017a.get(i11));
                bundle2.putSerializable("EXTRA_SHOULD_SHOW_LIST", Boolean.valueOf(z5));
                x0Var.setArguments(bundle2);
                return x0Var;
            } else {
                MeasuresGroup measuresGroup = this.f57017a.get(i11);
                og0.i iVar = new og0.i();
                Bundle bundle3 = new Bundle();
                if (user != null) {
                    bundle3.putParcelable("EXTRA_USER", user);
                }
                bundle3.putSerializable("EXTRA_MEASURE_GROUP", measuresGroup);
                iVar.setArguments(bundle3);
                return iVar;
            }
        }

        @Override // androidx.viewpager.widget.e
        public final CharSequence getPageTitle(int i11) {
            DateTime dateTime = new DateTime(this.f57017a.get(i11).getDate());
            Context context = this.f57020d;
            u.j(context, "context");
            return b50.b.m(dateTime, context, true, 4);
        }
    }

    public static ArrayList A3(HeartDetailActivity heartDetailActivity) {
        int i11 = heartDetailActivity.f57006g;
        if (i11 != 0 && i11 != 1) {
            ArrayList E = heartDetailActivity.f57013n.E(heartDetailActivity.f57004e.q(), heartDetailActivity.E3(), 0L);
            ArrayList arrayList = new ArrayList();
            Iterator it = E.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((MeasuresGroup) next).getAttrib() == 8) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        return heartDetailActivity.f57013n.E(heartDetailActivity.f57004e.q(), heartDetailActivity.E3(), null);
    }

    static void C3(HeartDetailActivity heartDetailActivity, List list) {
        heartDetailActivity.f57012m.f99538c.setVisibility(8);
        heartDetailActivity.f57011l.a(list);
        heartDetailActivity.f57012m.f99537b.setAdapter(heartDetailActivity.f57011l);
        if (!heartDetailActivity.f57009j && heartDetailActivity.f57005f != null) {
            heartDetailActivity.f57012m.f99537b.D(heartDetailActivity.F3(list), false);
        } else if (heartDetailActivity.f57005f == null) {
            heartDetailActivity.f57012m.f99537b.D(heartDetailActivity.F3(list), false);
        } else {
            heartDetailActivity.f57012m.f99537b.D(heartDetailActivity.f57010k, false);
            heartDetailActivity.f57009j = false;
        }
    }

    public static Intent D3(Context context, MeasuresGroup measuresGroup, int i11, long j5) {
        return new Intent(context, HeartDetailActivity.class).putExtra("measure_type", i11).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, j5).putExtra("extra_measures_group", measuresGroup);
    }

    private int[] E3() {
        int i11 = this.f57006g;
        if (i11 == 0) {
            return new int[]{10, 9};
        }
        if (i11 == 1) {
            return new int[]{11};
        }
        if (i11 == 2) {
            return new int[]{91};
        }
        return new int[0];
    }

    private int F3(List<MeasuresGroup> list) {
        long j5;
        MeasuresGroup measuresGroup = this.f57005f;
        if (measuresGroup != null) {
            j5 = measuresGroup.getId();
        } else {
            j5 = this.f57007h;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (list.get(i11).getId() == j5) {
                return i11;
            }
        }
        return list.size() - 1;
    }

    private void G3() {
        this.f57012m.f99538c.setVisibility(0);
        vh.o c11 = vh.h.h().c(new vh.m() { // from class: com.withings.wiscale2.heart.c
            @Override // vh.m
            public final Object call() {
                return HeartDetailActivity.A3(HeartDetailActivity.this);
            }
        });
        c11.q(new b());
        c11.p(this);
    }

    public static /* synthetic */ void z3(HeartDetailActivity heartDetailActivity, androidx.appcompat.app.c cVar) {
        Context context = heartDetailActivity.f57012m.f99537b.getContext();
        cVar.g(-2).setTextColor(ah.u.v(C1987R.attr.colorOnSurface, context));
        cVar.g(-1).setTextColor(ah.u.v(C1987R.attr.colorError, context));
    }

    @Override // com.withings.wiscale2.heart.bloodpressure.g.a
    public final void W2(final MeasuresGroup measuresGroup) {
        qc.b bVar = new qc.b(this);
        bVar.C(C1987R.string._DELETE_TITLE_);
        bVar.g(C1987R.string._DELETE_MEASURE_CONFIRMATION_);
        bVar.t(false);
        final androidx.appcompat.app.c create = bVar.w(C1987R.string._CANCEL_, null).z(C1987R.string._DELETE_YES_, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.heart.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                int i12 = HeartDetailActivity.f57003o;
                HeartDetailActivity heartDetailActivity = HeartDetailActivity.this;
                heartDetailActivity.getClass();
                final MeasuresGroup measuresGroup2 = measuresGroup;
                vh.h.l().a(new vh.a() { // from class: we0.j
                    @Override // vh.a
                    public final void run() {
                        sw.a z5 = sw.a.z();
                        u.i(z5, "get(...)");
                        zx.v vVar = new zx.v(z5);
                        zx.j a11 = zx.j.f111082d.a();
                        new fy.a(vVar, new fy.d(vVar, a11), new ey.a(new x(new ey.b(vVar))), a11).b(hy.g.a(MeasuresGroup.this));
                    }
                }).q(new HeartDetailActivity.a(measuresGroup2));
            }
        }).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.withings.wiscale2.heart.b
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                HeartDetailActivity.z3(HeartDetailActivity.this, create);
            }
        });
        create.show();
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        int i11 = this.f57006g;
        if (i11 == 0) {
            return "blood_pressure";
        }
        if (i11 == 1) {
            return "heart_rate";
        }
        if (i11 == 2) {
            return "pulse_wave_velocity";
        }
        return null;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // com.withings.wiscale2.heart.r, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        v b10 = v.b(getLayoutInflater());
        this.f57012m = b10;
        setContentView(b10.a());
        setSupportActionBar(this.f57012m.f99539d);
        getSupportActionBar().o(true);
        this.f57004e = m70.i.b().i(getIntent().getLongExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, -1L));
        this.f57006g = getIntent().getExtras().getInt("measure_type", -1);
        this.f57005f = (MeasuresGroup) getIntent().getExtras().getSerializable("extra_measures_group");
        this.f57007h = getIntent().getExtras().getLong("measure_group_id");
        this.f57008i = getIntent().getExtras().getBoolean("EXTRA_SHOULD_SHOW_LIST", false);
        this.f57011l = new c(this, getSupportFragmentManager(), this.f57004e, this.f57006g, this.f57008i);
        if (this.f57004e == null) {
            finish();
            return;
        }
        int i11 = this.f57006g;
        if (i11 == 0) {
            string = getString(C1987R.string._BLOOD_PRESSURE_);
        } else if (i11 == 1) {
            string = getString(C1987R.string._HEART_RATE_);
        } else if (i11 == 2) {
            string = getString(C1987R.string._PWV_);
        } else {
            string = getString(C1987R.string._HEART_);
        }
        setTitle(string);
        this.f57012m.f99537b.c(new d(this));
        G3();
    }

    @Override // com.withings.wiscale2.heart.r, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        vh.h.k(this);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        this.f57005f = (MeasuresGroup) getIntent().getExtras().getSerializable("extra_measures_group");
        G3();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        int i11 = bundle.getInt("position", -1);
        this.f57010k = i11;
        if (i11 != -1) {
            this.f57009j = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ViewPager viewPager = this.f57012m.f99537b;
        if (viewPager != null) {
            bundle.putInt("position", viewPager.getCurrentItem());
        }
    }
}
