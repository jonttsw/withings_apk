package com.withings.measure.detail.paged;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import fn0.k;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
import ym0.l;
/* compiled from: DatePagedFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/withings/measure/detail/paged/d;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/BlockableViewPager$b;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "measure-detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class d extends Fragment implements BlockableViewPager.b {

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f41713c;

    /* renamed from: d  reason: collision with root package name */
    private DateTime f41714d;

    /* renamed from: e  reason: collision with root package name */
    private int f41715e;

    /* renamed from: f  reason: collision with root package name */
    private final f f41716f;

    /* renamed from: g  reason: collision with root package name */
    private final g f41717g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f41718h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f41719i;

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f41712k = {v.c(d.class, "binding", "getBinding()Lcom/withings/measure/detail/databinding/FragmentDatePagedDataBinding;", 0), v.c(d.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), v.c(d.class, "firstDate", "getFirstDate()Lorg/joda/time/DateTime;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final a f41711j = new Object();

    /* compiled from: DatePagedFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: DatePagedFragment.kt */
    /* loaded from: classes4.dex */
    public interface b {
        void Y(d dVar, DateTime dateTime);
    }

    /* compiled from: DatePagedFragment.kt */
    /* loaded from: classes4.dex */
    private static final class c extends ViewPager.j {

        /* renamed from: a  reason: collision with root package name */
        private final d f41720a;

        public c(d fragment) {
            u.j(fragment, "fragment");
            this.f41720a = fragment;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public final void onPageSelected(int i11) {
            d.s1(this.f41720a, i11);
        }
    }

    /* compiled from: DatePagedFragment.kt */
    /* renamed from: com.withings.measure.detail.paged.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0556d extends w implements ym0.a<b> {
        C0556d() {
            super(0);
        }

        @Override // ym0.a
        public final b invoke() {
            FragmentActivity activity = d.this.getActivity();
            u.h(activity, "null cannot be cast to non-null type com.withings.measure.detail.paged.DatePagedFragment.Listener");
            return (b) activity;
        }
    }

    /* compiled from: DatePagedFragment.kt */
    /* loaded from: classes4.dex */
    static final class e extends w implements ym0.a<c> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final c invoke() {
            return new c(d.this);
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes4.dex */
    public static final class f implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f41723a = nm0.h.b(new com.withings.measure.detail.paged.e(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f41724b;

        public f(Fragment fragment) {
            this.f41724b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, k property) {
            Fragment thisRef = fragment;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f41723a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes4.dex */
    public static final class g implements bn0.d<Fragment, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f41725a = nm0.h.b(new com.withings.measure.detail.paged.f(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f41726b;

        public g(Fragment fragment) {
            this.f41726b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Fragment fragment, k property) {
            Fragment thisRef = fragment;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f41725a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes4.dex */
    public static final class h extends w implements l<d, oy.c> {
        @Override // ym0.l
        public final oy.c invoke(d dVar) {
            d fragment = dVar;
            u.j(fragment, "fragment");
            return oy.c.a(fragment.requireView());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public d() {
        super(C1987R.layout.fragment_date_paged_data);
        this.f41713c = by.kirich1409.viewbindingdelegate.e.a(this, new w(1), u9.a.a());
        DateTime now = DateTime.now();
        u.i(now, "now(...)");
        this.f41714d = now;
        this.f41716f = new f(this);
        this.f41717g = new g(this);
        this.f41718h = nm0.h.b(new C0556d());
        this.f41719i = nm0.h.b(new e());
    }

    public static final void s1(d dVar, int i11) {
        dVar.f41715e = i11;
        ((b) dVar.f41718h.getValue()).Y(dVar, dVar.x1().getDate(i11));
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        ((oy.c) this.f41713c.getValue(this, f41712k[0])).f90079a.setPagingEnabled(z5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final User getUser() {
        return (User) this.f41716f.getValue(this, f41712k[1]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Object obj;
        Object serializable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        DateTime dateTime = null;
        Serializable serializable2 = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = arguments.getSerializable("EXTRA_DATE", DateTime.class);
                obj = serializable;
            } else {
                Serializable serializable3 = arguments.getSerializable("EXTRA_DATE");
                if (serializable3 instanceof DateTime) {
                    serializable2 = serializable3;
                }
                obj = (DateTime) serializable2;
            }
            dateTime = (DateTime) obj;
        }
        u.g(dateTime);
        this.f41714d = dateTime;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        k<?>[] kVarArr = f41712k;
        k<?> kVar = kVarArr[0];
        LifecycleViewBindingProperty lifecycleViewBindingProperty = this.f41713c;
        BlockableViewPager blockableViewPager = ((oy.c) lifecycleViewBindingProperty.getValue(this, kVar)).f90079a;
        blockableViewPager.setOffscreenPageLimit(2);
        blockableViewPager.setNestedScrollingEnabled(true);
        this.f41715e = u1();
        BlockableViewPager blockableViewPager2 = ((oy.c) lifecycleViewBindingProperty.getValue(this, kVarArr[0])).f90079a;
        blockableViewPager2.setAdapter(x1());
        blockableViewPager2.D(this.f41715e, false);
        blockableViewPager2.c((c) this.f41719i.getValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final DateTime t1() {
        return this.f41714d;
    }

    public abstract int u1();

    public final int v1() {
        return this.f41715e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final DateTime w1() {
        return (DateTime) this.f41717g.getValue(this, f41712k[2]);
    }

    public abstract com.withings.measure.detail.paged.g x1();
}
