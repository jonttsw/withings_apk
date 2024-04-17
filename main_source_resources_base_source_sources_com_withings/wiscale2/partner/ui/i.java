package com.withings.wiscale2.partner.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.material.button.MaterialButton;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import tb0.u2;
/* compiled from: GoogleFitSignUpFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/partner/ui/i;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class i extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private final c f59103c;

    /* renamed from: d  reason: collision with root package name */
    private final d f59104d;

    /* renamed from: e  reason: collision with root package name */
    private final LifecycleViewBindingProperty f59105e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f59106f;

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f59102h = {androidx.camera.core.v.c(i.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(i.class, "partner", "getPartner()Lcom/withings/partner/model/Partner;", 0), androidx.camera.core.v.c(i.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentGooglefitSignupBinding;", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final a f59101g = new Object();

    /* compiled from: GoogleFitSignUpFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: GoogleFitSignUpFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<t10.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f59107a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final t10.e invoke() {
            t10.e eVar;
            eVar = t10.e.f97966j;
            if (eVar != null) {
                return eVar;
            }
            throw new IllegalArgumentException("you must call init before using get".toString());
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f59108a = nm0.h.b(new k(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f59109b;

        public c(Fragment fragment) {
            this.f59109b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f59108a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Fragment, Partner> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f59110a = nm0.h.b(new l(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f59111b;

        public d(Fragment fragment) {
            this.f59111b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.partner.model.Partner, java.lang.Object] */
        @Override // bn0.d
        public final Partner getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f59110a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.l<i, u2> {
        @Override // ym0.l
        public final u2 invoke(i iVar) {
            i fragment = iVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return u2.a(fragment.requireView());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public i() {
        super(C1987R.layout.fragment_googlefit_signup);
        this.f59103c = new c(this);
        this.f59104d = new d(this);
        this.f59105e = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
        this.f59106f = nm0.h.b(b.f59107a);
    }

    public static void s1(MaterialButton this_with, i this$0) {
        Object a11;
        kotlin.jvm.internal.u.j(this_with, "$this_with");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        try {
            a11 = BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), Dispatchers.getIO(), null, new j(this$0, null), 2, null);
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (nm0.k.b(a11) != null) {
            Toast.makeText(this$0.requireContext(), (int) C1987R.string._ERROR_CONNECTION_TIMEOUT_, 0).show();
        }
    }

    public static void t1(i this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        String string = this$0.getString(((Partner) this$0.f59104d.getValue(this$0, f59102h[1])).d());
        kotlin.jvm.internal.u.i(string, "getString(...)");
        try {
            requireContext.startActivity(u70.e.b(string, null));
        } catch (ActivityNotFoundException unused) {
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("http://play.google.com/store/apps/details?id=".concat(string)));
            intent.setFlags(268435456);
            requireContext.startActivity(intent);
        }
    }

    public static final Partner u1(i iVar) {
        iVar.getClass();
        return (Partner) iVar.f59104d.getValue(iVar, f59102h[1]);
    }

    public static final t10.e v1(i iVar) {
        return (t10.e) iVar.f59106f.getValue();
    }

    public static final User w1(i iVar) {
        return (User) iVar.f59103c.getValue(iVar, f59102h[0]);
    }

    private final u2 x1() {
        return (u2) this.f59105e.getValue(this, f59102h[2]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i11;
        super.onResume();
        ConstraintLayout b10 = x1().b();
        kotlin.jvm.internal.u.i(b10, "getRoot(...)");
        int i12 = 0;
        boolean z5 = true;
        ay.b.n(b10, false, true, 23);
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        if (u70.e.a(requireContext, ((Partner) this.f59104d.getValue(this, f59102h[1])).d(), null) == null) {
            z5 = false;
        }
        x1().f99534d.setOnClickListener(new androidx.media3.ui.h(this, 19));
        MaterialButton materialButton = x1().f99532b;
        kotlin.jvm.internal.u.g(materialButton);
        if (!z5) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        materialButton.setVisibility(i11);
        materialButton.setOnClickListener(new fa0.c(5, materialButton, this));
        MaterialButton materialButton2 = x1().f99533c;
        kotlin.jvm.internal.u.g(materialButton2);
        if (z5) {
            i12 = 4;
        }
        materialButton2.setVisibility(i12);
        materialButton2.setOnClickListener(new com.google.android.material.search.j(this, 15));
    }
}
