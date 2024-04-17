package com.withings.environment.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.withings.android.activity.WithingsActivity;
import com.withings.device.Device;
import com.withings.environment.ui.j;
import com.withings.periodsbar.Period;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import java.util.Iterator;
import org.joda.time.DateTime;
import qw.a;
/* loaded from: classes3.dex */
public class Wsd01EnvironmentActivity extends WithingsActivity implements BlockableViewPager.b, j.a, py.a {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f38967j = 0;

    /* renamed from: a  reason: collision with root package name */
    private Toolbar f38968a;

    /* renamed from: b  reason: collision with root package name */
    private BlockableViewPager f38969b;

    /* renamed from: c  reason: collision with root package name */
    private DateTime f38970c;

    /* renamed from: d  reason: collision with root package name */
    private Device f38971d;

    /* renamed from: e  reason: collision with root package name */
    private int f38972e;

    /* renamed from: f  reason: collision with root package name */
    private a f38973f;

    /* renamed from: g  reason: collision with root package name */
    private ViewPager.j f38974g;

    /* renamed from: h  reason: collision with root package name */
    private qw.a f38975h;

    /* renamed from: i  reason: collision with root package name */
    private j f38976i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a extends qy.a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        private final Device f38977a;

        /* renamed from: b  reason: collision with root package name */
        private final Context f38978b;

        /* renamed from: c  reason: collision with root package name */
        private int f38979c;

        public a(Context context, FragmentManager fragmentManager, Device device, DateTime dateTime) {
            super(fragmentManager, dateTime.minusYears(2), dateTime);
            this.f38977a = device;
            this.f38978b = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Fragment b(int i11) {
            Fragment fragment;
            boolean z5;
            Iterator<Fragment> it = Wsd01EnvironmentActivity.this.getSupportFragmentManager().f0().iterator();
            while (true) {
                if (it.hasNext()) {
                    fragment = it.next();
                    if (getPosition((DateTime) fragment.getArguments().getSerializable(FoodDayFragment.ARG_DAY)) == i11) {
                        z5 = true;
                        continue;
                    } else {
                        z5 = false;
                        continue;
                    }
                    if (z5) {
                        break;
                    }
                } else {
                    fragment = null;
                    break;
                }
            }
            return fragment;
        }

        @Override // qy.a
        public final Fragment getFragment(DateTime dateTime) {
            int i11 = this.f38979c;
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_DEVICE", this.f38977a);
            bundle.putSerializable(FoodDayFragment.ARG_DAY, dateTime);
            bundle.putInt("extra_current_scroll", i11);
            jVar.setArguments(bundle);
            if (dateTime.withTimeAtStartOfDay().equals(Wsd01EnvironmentActivity.this.f38970c.withTimeAtStartOfDay())) {
                jVar.z1(true);
            }
            return jVar;
        }

        @Override // androidx.viewpager.widget.e
        public final CharSequence getPageTitle(int i11) {
            return b50.b.i(this.f38978b, getDate(i11));
        }

        @Override // qw.a.b
        public final void onLoaded(DateTime dateTime, DateTime dateTime2) {
            if (getTheMaxDateTime().isBefore(dateTime2)) {
                dateTime2 = getTheMaxDateTime();
            }
            for (DateTime dateTime3 = new DateTime(dateTime); dateTime3.isBefore(dateTime2); dateTime3 = dateTime3.plusDays(1)) {
                j jVar = (j) b(getPosition(dateTime3));
                if (jVar != null) {
                    jVar.y1();
                }
            }
        }

        @Override // com.withings.measure.detail.paged.g
        public final void setCurrentScroll(int i11) {
            this.f38979c = i11;
            for (int i12 = -2; i12 <= 2; i12++) {
                if (i12 != 0) {
                    Fragment b10 = b(Wsd01EnvironmentActivity.this.f38972e + i12);
                    if (b10 instanceof j) {
                        ((j) b10).customScrollTo(i11);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void B3(Wsd01EnvironmentActivity wsd01EnvironmentActivity, int i11) {
        wsd01EnvironmentActivity.f38972e = i11;
        DateTime date = wsd01EnvironmentActivity.f38973f.getDate(i11);
        wsd01EnvironmentActivity.f38970c = date;
        b0.V(wsd01EnvironmentActivity, Period.f43720e, date);
        wsd01EnvironmentActivity.f38975h.k(i11);
        j jVar = (j) wsd01EnvironmentActivity.f38973f.b(i11);
        if (jVar != null) {
            jVar.z1(true);
        }
        j jVar2 = wsd01EnvironmentActivity.f38976i;
        if (jVar2 != null) {
            jVar2.z1(false);
        }
        wsd01EnvironmentActivity.f38976i = jVar;
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        this.f38969b.setPagingEnabled(z5);
    }

    @Override // com.withings.environment.ui.j.a
    public final void c2(j jVar, DateTime dateTime) {
        qw.a aVar = this.f38975h;
        if (aVar != null) {
            boolean l5 = aVar.l(dateTime);
            jVar.A1(l5);
            if (!l5) {
                jVar.D1();
            }
        }
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return "environment";
    }

    @Override // com.withings.environment.ui.j.a
    public final void j2(int i11) {
        this.f38973f.setCurrentScroll(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38971d = (Device) getIntent().getSerializableExtra("EXTRA_DEVICE");
        DateTime dateTime = (DateTime) getIntent().getSerializableExtra("EXTRA_DATE");
        this.f38970c = dateTime;
        if (dateTime == null) {
            this.f38970c = DateTime.now();
        }
        setContentView(C1987R.layout.activity_wsd_environment);
        this.f38968a = (Toolbar) findViewById(C1987R.id.toolbar);
        this.f38969b = (BlockableViewPager) findViewById(C1987R.id.view_pager);
        setSupportActionBar(this.f38968a);
        getSupportActionBar().o(true);
        this.f38974g = new e(this);
        a aVar = new a(this, getSupportFragmentManager(), this.f38971d, this.f38970c);
        this.f38973f = aVar;
        qw.a aVar2 = new qw.a(new ui.b(this), new vq.a(this.f38971d, aVar), 10, DateTime.now(), 3);
        this.f38975h = aVar2;
        aVar2.o(this.f38973f);
        this.f38969b.setOffscreenPageLimit(2);
        this.f38969b.setAdapter(this.f38973f);
        this.f38969b.c(this.f38974g);
        this.f38969b.D((this.f38973f.getCount() - 1) - pm.d.a(this.f38970c, this.f38973f.getTheMaxDateTime()), false);
        int count = (this.f38973f.getCount() - 1) - pm.d.a(this.f38970c, this.f38973f.getTheMaxDateTime());
        this.f38972e = count;
        this.f38975h.k(count);
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
        this.f38970c = (DateTime) bundle.getSerializable("date");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f38975h.p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("date", this.f38970c);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        this.f38975h.q();
        super.onStop();
    }
}
