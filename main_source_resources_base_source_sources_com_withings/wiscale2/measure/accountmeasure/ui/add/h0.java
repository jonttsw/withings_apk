package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import org.joda.time.DateTime;
/* compiled from: AddMeasureFragment.kt */
/* loaded from: classes5.dex */
public abstract class h0 extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private final c f58179c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f58180d;

    /* renamed from: e  reason: collision with root package name */
    public User f58181e;

    /* renamed from: f  reason: collision with root package name */
    public DateTime f58182f;

    /* renamed from: g  reason: collision with root package name */
    private long f58183g;

    /* renamed from: h  reason: collision with root package name */
    private a f58184h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f58185i;

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f58178k = {androidx.camera.core.v.c(h0.class, "fromDetailView", "getFromDetailView()Z", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final b f58177j = new Object();

    /* compiled from: AddMeasureFragment.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void b2(MeasuresGroup measuresGroup);

        void onCancel();
    }

    /* compiled from: AddMeasureFragment.kt */
    /* loaded from: classes5.dex */
    public static final class b {
        public static void a(h0 h0Var, long j5, boolean z5) {
            h0Var.setArguments(androidx.core.os.e.a(new nm0.j("EXTRA_USER", Long.valueOf(j5)), new nm0.j("EXTRA_FROM_DETAIL", Boolean.valueOf(z5))));
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Fragment, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58186a = nm0.h.b(new i0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f58187b;

        public c(Fragment fragment) {
            this.f58187b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58186a.getValue();
        }
    }

    /* compiled from: AddMeasureFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<Toolbar> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            View view = h0.this.getView();
            if (view != null) {
                return (Toolbar) view.findViewById(C1987R.id.toolbar);
            }
            return null;
        }
    }

    public h0(int i11) {
        super(i11);
        this.f58179c = new c(this);
        this.f58180d = nm0.h.b(new d());
    }

    public final User getUser() {
        User user = this.f58181e;
        if (user != null) {
            return user;
        }
        kotlin.jvm.internal.u.s(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        try {
            this.f58184h = (a) context;
        } catch (ClassCastException unused) {
            throw new ClassCastException(w6.o.a(context.getClass().getSimpleName(), " must implement ", a.class.getSimpleName()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long j5;
        User e11;
        DateTime dateTime;
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle arguments = getArguments();
        if (arguments != null) {
            j5 = arguments.getLong("EXTRA_USER", 0L);
        } else {
            j5 = 0;
        }
        this.f58183g = j5;
        if (j5 > 0) {
            e11 = m70.i.b().i(this.f58183g);
            kotlin.jvm.internal.u.g(e11);
        } else {
            e11 = m70.i.b().e();
            kotlin.jvm.internal.u.g(e11);
        }
        this.f58181e = e11;
        if (bundle == null) {
            dateTime = DateTime.now().minus(1L);
            kotlin.jvm.internal.u.g(dateTime);
        } else {
            dateTime = new DateTime(bundle.getLong("date"));
        }
        this.f58182f = dateTime;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.u.j(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putLong("date", u1().getMillis());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        ActionBar supportActionBar;
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        nm0.g gVar = this.f58180d;
        if (((Toolbar) gVar.getValue()) != null) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) getActivity();
            if (appCompatActivity != null) {
                appCompatActivity.setSupportActionBar((Toolbar) gVar.getValue());
            }
            if (appCompatActivity != null && (supportActionBar = appCompatActivity.getSupportActionBar()) != null) {
                supportActionBar.o(true);
            }
        }
    }

    public abstract MeasuresGroup s1();

    public final a t1() {
        return this.f58184h;
    }

    public final DateTime u1() {
        DateTime dateTime = this.f58182f;
        if (dateTime != null) {
            return dateTime;
        }
        kotlin.jvm.internal.u.s("dateTime");
        throw null;
    }

    public final boolean v1() {
        return ((Boolean) this.f58179c.getValue(this, f58178k[0])).booleanValue();
    }

    public abstract boolean w1();

    public final boolean x1() {
        return this.f58185i;
    }

    public final void y1(boolean z5) {
        this.f58185i = z5;
    }
}
