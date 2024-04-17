package com.withings.wiscale2.heart.bloodpressure;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.withings.coach.chatbot.y0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.tutorials.ui.deprecated.TutorialActivity;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.ShareWithMyDoctorActivity;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: BloodPressureOptionSheetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/heart/bloodpressure/d0;", "Lcom/google/android/material/bottomsheet/l;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class d0 extends com.google.android.material.bottomsheet.l {

    /* renamed from: c  reason: collision with root package name */
    private b f57355c;

    /* renamed from: d  reason: collision with root package name */
    private final c f57356d = new c(this);

    /* renamed from: e  reason: collision with root package name */
    private int f57357e = -1;

    /* renamed from: g  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57354g = {androidx.camera.core.v.c(d0.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final a f57353f = new Object();

    /* compiled from: BloodPressureOptionSheetFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: BloodPressureOptionSheetFragment.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void m();
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57358a = nm0.h.b(new i0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f57359b;

        public c(Fragment fragment) {
            this.f57359b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57358a.getValue();
        }
    }

    public static void s1(d0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        b bVar = this$0.f57355c;
        if (bVar != null) {
            bVar.m();
        }
        this$0.dismiss();
    }

    public static void t1(d0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.startActivity(new Intent(this$0.getContext(), ShareWithMyDoctorActivity.class).putExtra("extra_user", (User) this$0.f57356d.getValue(this$0, f57354g[0])));
    }

    public static void u1(View view, d0 this$0) {
        kotlin.jvm.internal.u.j(view, "$view");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.startActivity(TutorialActivity.z3(view.getContext(), we0.k.a(this$0.f57357e, view.getContext()), this$0.getString(C1987R.string._SKIP_), this$0.getString(C1987R.string._OK_)));
        this$0.dismiss();
    }

    public static final void w1(d0 d0Var, View view) {
        d0Var.getClass();
        view.findViewById(C1987R.id.dialog_bp_graph_add_measurement).setOnClickListener(new io.j(d0Var, 10));
        View findViewById = view.findViewById(C1987R.id.dialog_bp_graph_tutorial);
        if (d0Var.f57357e != -1) {
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(new y0(3, view, d0Var));
        }
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f57355c = (b) context;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f57355c = null;
        super.onDetach();
    }

    @Override // androidx.appcompat.app.u, androidx.fragment.app.m
    public final void setupDialog(Dialog dialog, int i11) {
        kotlin.jvm.internal.u.j(dialog, "dialog");
        super.setupDialog(dialog, i11);
        View inflate = LayoutInflater.from(getContext()).inflate(C1987R.layout.dialog_bp_graph, (ViewGroup) null);
        dialog.setContentView(inflate);
        kotlin.jvm.internal.u.g(inflate);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new h0(inflate, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getMain(), null, new e0(inflate, this, null), 2, null);
        inflate.findViewById(C1987R.id.share_with_doctor).setOnClickListener(new vn.d(this, 11));
    }
}
