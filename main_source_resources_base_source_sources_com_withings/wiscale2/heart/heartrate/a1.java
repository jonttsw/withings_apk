package com.withings.wiscale2.heart.heartrate;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureActivity;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: HeartRateOptionSheetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/heart/heartrate/a1;", "Lcom/google/android/material/bottomsheet/l;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class a1 extends com.google.android.material.bottomsheet.l {

    /* renamed from: c  reason: collision with root package name */
    private final b f57551c = new b(this);

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57550e = {androidx.camera.core.v.c(a1.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: d  reason: collision with root package name */
    public static final a f57549d = new Object();

    /* compiled from: HeartRateOptionSheetFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57552a = nm0.h.b(new e1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f57553b;

        public b(Fragment fragment) {
            this.f57553b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57552a.getValue();
        }
    }

    public static void s1(a1 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        AddMeasureActivity.a aVar = AddMeasureActivity.f58098m;
        Context requireContext = this$0.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        long q11 = ((User) this$0.f57551c.getValue(this$0, f57550e[0])).q();
        aVar.getClass();
        this$0.startActivity(AddMeasureActivity.a.a(requireContext, 11, true, false, q11, null));
        this$0.dismiss();
    }

    @Override // androidx.appcompat.app.u, androidx.fragment.app.m
    public final void setupDialog(Dialog dialog, int i11) {
        kotlin.jvm.internal.u.j(dialog, "dialog");
        super.setupDialog(dialog, i11);
        View inflate = LayoutInflater.from(getContext()).inflate(C1987R.layout.dialog_hr_graph, (ViewGroup) null);
        dialog.setContentView(inflate);
        kotlin.jvm.internal.u.g(inflate);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new d1(inflate, this, null), 3, null);
        inflate.findViewById(C1987R.id.dialog_hr_graph_add_measurement).setOnClickListener(new com.withings.device.details.scale.z(this, 14));
    }
}
