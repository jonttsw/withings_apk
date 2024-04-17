package com.withings.wiscale2.partner.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.partner.model.PartnerAssociationStatusLoader;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import kotlin.Metadata;
import tb0.x2;
/* compiled from: PartnerErrorFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/partner/ui/z;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class z extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private c0 f59247c;

    /* renamed from: d  reason: collision with root package name */
    private final b f59248d;

    /* renamed from: e  reason: collision with root package name */
    private final c f59249e;

    /* renamed from: f  reason: collision with root package name */
    private final LifecycleViewBindingProperty f59250f;

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f59246h = {androidx.camera.core.v.c(z.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(z.class, "partner", "getPartner()Lcom/withings/partner/model/Partner;", 0), androidx.camera.core.v.c(z.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentPartnerErrorBinding;", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final a f59245g = new Object();

    /* compiled from: PartnerErrorFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f59251a = nm0.h.b(new a0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f59252b;

        public b(Fragment fragment) {
            this.f59252b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f59251a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Fragment, Partner> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f59253a = nm0.h.b(new b0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f59254b;

        public c(Fragment fragment) {
            this.f59254b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.partner.model.Partner, java.lang.Object] */
        @Override // bn0.d
        public final Partner getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f59253a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<z, x2> {
        @Override // ym0.l
        public final x2 invoke(z zVar) {
            z fragment = zVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return x2.a(fragment.requireView());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public z() {
        super(C1987R.layout.fragment_partner_error);
        this.f59248d = new b(this);
        this.f59249e = new c(this);
        this.f59250f = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
    }

    public static void s1(z this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        c0 c0Var = this$0.f59247c;
        if (c0Var != null) {
            c0Var.r0();
        }
    }

    private final x2 t1() {
        return (x2) this.f59250f.getValue(this, f59246h[2]);
    }

    private final Partner u1() {
        return (Partner) this.f59249e.getValue(this, f59246h[1]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        if (context instanceof c0) {
            this.f59247c = (c0) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f59247c = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.u.h(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) requireActivity;
        appCompatActivity.setSupportActionBar(t1().f99631e);
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        t1().f99629c.setText(getString(u1().w()));
        t1().f99628b.setImageResource(u1().v());
        TextView textView = t1().f99627a;
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        textView.setText(new PartnerAssociationStatusLoader(requireContext, (User) this.f59248d.getValue(this, f59246h[0]), u1()).a(u1().e()));
        t1().f99630d.setText(String.format("%s %s", Arrays.copyOf(new Object[]{requireContext().getString(C1987R.string._CONFIGURATION_), requireContext().getString(u1().w())}, 2)));
        t1().f99630d.setOnClickListener(new androidx.viewpager.widget.d(this, 12));
        ay.b.n(view, false, true, 23);
        Toolbar toolbar = t1().f99631e;
        kotlin.jvm.internal.u.i(toolbar, "toolbar");
        ay.b.n(toolbar, true, false, 29);
    }
}
