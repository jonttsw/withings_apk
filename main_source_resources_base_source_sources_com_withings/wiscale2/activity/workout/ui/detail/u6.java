package com.withings.wiscale2.activity.workout.ui.detail;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.activity.ui.VasistasInfoActivity;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.joda.time.DateTime;
/* compiled from: WorkoutOptionSheetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/activity/workout/ui/detail/u6;", "Lcom/google/android/material/bottomsheet/l;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class u6 extends com.google.android.material.bottomsheet.l {

    /* renamed from: c  reason: collision with root package name */
    private tb0.h1 f49700c;

    /* renamed from: d  reason: collision with root package name */
    private final c f49701d = new c(this);

    /* renamed from: e  reason: collision with root package name */
    private final d f49702e = new d(this);

    /* renamed from: f  reason: collision with root package name */
    private b f49703f;

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f49699h = {androidx.camera.core.v.c(u6.class, FoodDayFragment.ARG_DAY, "getDay()Lorg/joda/time/DateTime;", 0), androidx.camera.core.v.c(u6.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final a f49698g = new Object();

    /* compiled from: WorkoutOptionSheetFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: WorkoutOptionSheetFragment.kt */
    /* loaded from: classes4.dex */
    public interface b {
        void H(u6 u6Var);

        void K(u6 u6Var);

        void L(u6 u6Var);

        void v0(u6 u6Var);
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Fragment, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f49704a = nm0.h.b(new y6(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f49705b;

        public c(Fragment fragment) {
            this.f49705b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f49704a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f49706a = nm0.h.b(new z6(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f49707b;

        public d(Fragment fragment) {
            this.f49707b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f49706a.getValue();
        }
    }

    public static void s1(u6 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        b bVar = this$0.f49703f;
        if (bVar != null) {
            bVar.v0(this$0);
        }
    }

    public static void t1(u6 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        b bVar = this$0.f49703f;
        if (bVar != null) {
            bVar.H(this$0);
        }
    }

    public static void u1(u6 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        b bVar = this$0.f49703f;
        if (bVar != null) {
            bVar.L(this$0);
        }
    }

    public static void v1(u6 this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        VasistasInfoActivity.e eVar = VasistasInfoActivity.f48540h;
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        fn0.k<Object>[] kVarArr = f49699h;
        User user = (User) this$0.f49702e.getValue(this$0, kVarArr[1]);
        DateTime day = (DateTime) this$0.f49701d.getValue(this$0, kVarArr[0]);
        eVar.getClass();
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(day, "day");
        Intent putExtra = new Intent(context, VasistasInfoActivity.class).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", day);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        this$0.startActivity(putExtra);
    }

    public static void w1(u6 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        b bVar = this$0.f49703f;
        if (bVar != null) {
            bVar.K(this$0);
        }
    }

    @Override // androidx.appcompat.app.u, androidx.fragment.app.m
    public final void setupDialog(Dialog dialog, int i11) {
        kotlin.jvm.internal.u.j(dialog, "dialog");
        super.setupDialog(dialog, i11);
        tb0.h1 b10 = tb0.h1.b(getLayoutInflater());
        this.f49700c = b10;
        dialog.setContentView(b10.a());
        tb0.h1 h1Var = this.f49700c;
        if (h1Var != null) {
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new x6(h1Var, this, null), 3, null);
            tb0.h1 h1Var2 = this.f49700c;
            if (h1Var2 != null) {
                h1Var2.f99132d.setOnClickListener(new androidx.media3.ui.i(this, 9));
                h1Var2.f99130b.setOnClickListener(new com.google.android.material.search.j(this, 8));
                h1Var2.f99134f.setOnClickListener(new com.google.android.material.search.k(this, 8));
                h1Var2.f99133e.setOnClickListener(new sg.f(this, 10));
                tb0.h1 h1Var3 = this.f49700c;
                if (h1Var3 != null) {
                    LineCellView lineCellView = h1Var3.f99135g;
                    kotlin.jvm.internal.u.g(lineCellView);
                    lineCellView.setVisibility(8);
                    lineCellView.setOnClickListener(new androidx.media3.ui.h(this, 9));
                    return;
                }
                kotlin.jvm.internal.u.s("binding");
                throw null;
            }
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }

    public final void y1(b bVar) {
        this.f49703f = bVar;
    }
}
