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
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import java.util.Iterator;
import org.joda.time.DateTime;
import qw.a;
import vh.o;
/* loaded from: classes3.dex */
public class WS50Activity extends WithingsActivity implements ViewPager.h, a.b {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f38958e = 0;

    /* renamed from: a  reason: collision with root package name */
    private BlockableViewPager f38959a;

    /* renamed from: b  reason: collision with root package name */
    private a f38960b;

    /* renamed from: c  reason: collision with root package name */
    private Device f38961c;

    /* renamed from: d  reason: collision with root package name */
    private qw.a f38962d;

    /* loaded from: classes3.dex */
    public class a extends qy.a {

        /* renamed from: a  reason: collision with root package name */
        private final BlockableViewPager.a f38963a;

        /* renamed from: b  reason: collision with root package name */
        private final Device f38964b;

        /* renamed from: c  reason: collision with root package name */
        private Context f38965c;

        public a(Context context, FragmentManager fragmentManager, DateTime dateTime, Device device, BlockableViewPager.a aVar) {
            super(fragmentManager, dateTime.minusYears(2), dateTime);
            this.f38964b = device;
            this.f38963a = aVar;
            this.f38965c = context;
        }

        @Override // qy.a
        public final Fragment getFragment(DateTime dateTime) {
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_DEVICE", this.f38964b);
            bundle.putLong("com.withings.wiscale2.extra.day_as_millis", dateTime.getMillis());
            dVar.setArguments(bundle);
            dVar.x1(this.f38963a);
            return dVar;
        }

        @Override // androidx.viewpager.widget.e
        public final CharSequence getPageTitle(int i11) {
            return b50.b.i(this.f38965c, getDate(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_ws50);
        this.f38959a = (BlockableViewPager) findViewById(C1987R.id.view_pager);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        getSupportActionBar().o(true);
        getSupportActionBar().q(true);
        this.f38961c = (Device) getIntent().getExtras().getSerializable("device_model");
        a aVar = new a(this, getSupportFragmentManager(), DateTime.now().withTimeAtStartOfDay(), this.f38961c, new BlockableViewPager.a(this.f38959a));
        this.f38960b = aVar;
        this.f38959a.setAdapter(aVar);
        this.f38959a.setOffscreenPageLimit(2);
        this.f38959a.setPageMargin(ah.g.k(-20, this));
        this.f38959a.D(this.f38960b.getCount() - 1, false);
        this.f38959a.setOnPageChangeListener(this);
        this.f38959a.setPageMargin(Math.round(ah.g.k(-20, this)));
        qw.a aVar2 = new qw.a(new ui.b(this), new vq.a(this.f38961c, this.f38960b), 10, DateTime.now().minusDays(10), 3);
        this.f38962d = aVar2;
        aVar2.o(this);
        this.f38962d.p();
    }

    @Override // qw.a.b
    public final void onLoaded(DateTime dateTime, DateTime dateTime2) {
        Fragment fragment;
        while (dateTime.isBefore(dateTime2)) {
            a aVar = this.f38960b;
            int position = aVar.getPosition(dateTime);
            Iterator<Fragment> it = WS50Activity.this.getSupportFragmentManager().f0().iterator();
            while (true) {
                if (it.hasNext()) {
                    fragment = it.next();
                    if (aVar.getPosition(new DateTime(fragment.getArguments().getSerializable("com.withings.wiscale2.extra.day_as_millis"))) == position) {
                        break;
                    }
                } else {
                    fragment = null;
                    break;
                }
            }
            d dVar = (d) fragment;
            if (dVar != null) {
                vh.h.b(dVar);
                o c11 = vh.h.h().c(new vq.b(dVar));
                c11.q(new com.withings.environment.ui.a(dVar));
                c11.p(dVar);
            }
            dateTime = dateTime.plusDays(1).withTimeAtStartOfDay();
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageSelected(int i11) {
        this.f38962d.k(i11);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        qw.a aVar = this.f38962d;
        if (aVar != null) {
            aVar.p();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        qw.a aVar = this.f38962d;
        if (aVar != null) {
            aVar.q();
        }
        super.onStop();
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrollStateChanged(int i11) {
    }

    @Override // androidx.viewpager.widget.ViewPager.h
    public final void onPageScrolled(int i11, float f11, int i12) {
    }
}
