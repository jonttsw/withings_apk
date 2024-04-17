package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import com.withings.vo2max.core.Vo2MaxStatus;
import com.withings.wiscale2.C1987R;
import jm.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m80.a;
import org.joda.time.DateTime;
/* compiled from: WorkoutNotification.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutNotificationKt$createVo2maxValueNotificationLiveData$2", f = "WorkoutNotification.kt", l = {ConstantsWs.WS_STATUS_WRONGDEVICESN, ConstantsWs.WS_STATUS_WRONGFIRSTNAME}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class p6 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<x5>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Vo2MaxStatus f49539a;

    /* renamed from: b  reason: collision with root package name */
    int f49540b;

    /* renamed from: c  reason: collision with root package name */
    int f49541c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Object f49542d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ MeasuresGroup f49543e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ User f49544f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ iy.e f49545g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ Context f49546h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(MeasuresGroup measuresGroup, User user, iy.e eVar, Context context, qm0.d<? super p6> dVar) {
        super(2, dVar);
        this.f49543e = measuresGroup;
        this.f49544f = user;
        this.f49545g = eVar;
        this.f49546h = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        p6 p6Var = new p6(this.f49543e, this.f49544f, this.f49545g, this.f49546h, dVar);
        p6Var.f49542d = obj;
        return p6Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<x5> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((p6) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        boolean z5;
        Object d11;
        Vo2MaxStatus vo2MaxStatus;
        int i11;
        int i12;
        int ordinal;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i13 = this.f49541c;
        boolean z11 = false;
        MeasuresGroup measuresGroup = this.f49543e;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i14 = this.f49540b;
            Vo2MaxStatus vo2MaxStatus2 = this.f49539a;
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f49542d;
            vo2MaxStatus = vo2MaxStatus2;
            i11 = i14;
            d11 = obj;
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f49542d;
            int a11 = an0.a.a(measuresGroup.getMeasureForType(123).f95794y);
            int i15 = m80.a.f81744h;
            User user = this.f49544f;
            int d12 = user.d();
            if (user.p() == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            Vo2MaxStatus g11 = a.C1293a.g(a.C1293a.f(d12, z5), a11);
            long q11 = user.q();
            this.f49542d = h0Var;
            this.f49539a = g11;
            this.f49540b = a11;
            this.f49541c = 1;
            d11 = iy.e.d(this.f49545g, q11, 123, null, null, true, this, 444);
            if (d11 == coroutineSingletons) {
                return coroutineSingletons;
            }
            vo2MaxStatus = g11;
            i11 = a11;
        }
        ky.d dVar = (ky.d) d11;
        if (dVar != null && measuresGroup.getId() == dVar.d()) {
            z11 = true;
        }
        DateTime dateTime = new DateTime(measuresGroup.getDate());
        Context context = this.f49546h;
        String t11 = b50.b.t(context, dateTime);
        SpannableStringBuilder c11 = jm.a.c(a.d.a(context), 123, i11, C1987R.style.data6White, 0, 56);
        GradientDrawable a12 = n80.a.a(context, vo2MaxStatus);
        if (z11) {
            i12 = C1987R.string.vo2maxItem_firstFitnessLevel;
        } else {
            i12 = C1987R.string.vo2maxItem_updateFitnessLevel;
        }
        String string = context.getString(i12);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        int i16 = C1987R.string.vo2maxItem_description_firstFitnessLevel;
        if (!z11 && (ordinal = vo2MaxStatus.ordinal()) != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                i16 = C1987R.string.vo2maxItem_description_excellent;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            i16 = C1987R.string.vo2maxItem_description_good;
                        }
                    } else {
                        i16 = C1987R.string.vo2maxItem_description_fair;
                    }
                } else {
                    i16 = C1987R.string.vo2maxItem_description_poor;
                }
            } else {
                i16 = C1987R.string.vo2maxItem_description_veryPoor;
            }
        }
        String string2 = context.getString(i16, c11);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        s1 s1Var = new s1(this.f49543e, t11, c11, a12, string, string2);
        this.f49542d = null;
        this.f49539a = null;
        this.f49541c = 2;
        if (h0Var.emit(s1Var, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
