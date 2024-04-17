package com.withings.measurements.ui;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measure.detail.ui.screen.MeasureDetailActivity;
import com.withings.nervehealth.core.model.MeasureCategory;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.wiscale2.bodytemperature.data.BodyTemperatureMeasureDetailScreen;
import gz.j0;
import java.io.Serializable;
import java.util.Iterator;
import javax.inject.Inject;
import org.joda.time.DateTime;
/* compiled from: MeasurementRedirection.kt */
/* loaded from: classes4.dex */
public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    private final com.withings.measure.detail.ui.screen.v f42139a;

    /* renamed from: b  reason: collision with root package name */
    private final ch.d f42140b;

    @Inject
    public s1(ah.b bVar, ch.d intentBuilder) {
        kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
        this.f42139a = bVar;
        this.f42140b = intentBuilder;
    }

    private final void c(Context context, User user, DateTime date, boolean z5) {
        ((ah.l) this.f42140b.v()).getClass();
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(date, "date");
        Intent putExtra = ah.a.a(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.wiscale2.heart.afib.AFibActivity", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", date).putExtra("is_medical", z5);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        context.startActivity(putExtra);
    }

    private final void d(Context context, DateTime date, long j5, MeasureCategory measureCategory) {
        Object obj;
        ch.f f11 = this.f42140b.f();
        int b10 = measureCategory.b();
        ((ah.v) f11).getClass();
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(date, "date");
        Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.nervehealth.ui.NerveHealthActivity").putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, j5).putExtra("date", date);
        MeasureCategory.f42340b.getClass();
        Iterator it = ((kotlin.collections.c) MeasureCategory.a()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((MeasureCategory) obj).b() == b10) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Intent putExtra2 = putExtra.putExtra("measure_category", (MeasureCategory) obj);
        kotlin.jvm.internal.u.i(putExtra2, "putExtra(...)");
        context.startActivity(putExtra2);
    }

    private final void e(Context context, com.withings.user.core.models.User user, DateTime startDate, boolean z5) {
        this.f42140b.l().getClass();
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(startDate, "startDate");
        Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity").putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", startDate).putExtra("is_sleep_apnea", z5);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        context.startActivity(putExtra);
    }

    private final void f(Context context, User user, DateTime date) {
        this.f42140b.E().getClass();
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(date, "date");
        Intent putExtra = ah.a.a(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.wiscale2.spo2.Spo2Activity", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", date);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        context.startActivity(putExtra);
    }

    private final void g(Context context, User user, gz.e1 e1Var, boolean z5) {
        ch.c v11 = this.f42140b.v();
        DateTime date = e1Var.c();
        ((ah.l) v11).getClass();
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(date, "date");
        Intent putExtra = ah.a.a(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.wiscale2.vascularage.VascularAgeActivity", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", date).putExtra("extra_should_scroll_pwv", z5);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        context.startActivity(putExtra);
    }

    public final void a(Context context, j0.a item, User user) {
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(item, "item");
        boolean z5 = item instanceof gz.f;
        ch.d dVar = this.f42140b;
        if (z5) {
            a3.b b10 = dVar.b();
            DateTime c11 = ((gz.f) item).c();
            b10.getClass();
            context.startActivity(a3.b.c(context, user, c11, true));
        } else if (item instanceof gz.m1) {
            dVar.n().getClass();
            Intent a11 = ah.a.a(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.wiscale2.activity.workout.ui.detail.AllWorkoutsActivity", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
            kotlin.jvm.internal.u.i(a11, "putExtra(...)");
            context.startActivity(a11);
        } else if (item instanceof gz.q) {
            ah.g e11 = dVar.e();
            long q11 = user.q();
            long currentTimeMillis = System.currentTimeMillis();
            e11.getClass();
            context.startActivity(ah.g.m(context, q11, currentTimeMillis, "item"));
        } else if (item instanceof gz.c1) {
            ah.b I = dVar.I();
            DateTime c12 = ((gz.c1) item).c();
            I.getClass();
            context.startActivity(ah.b.e(context, user, c12, true));
        } else if (item instanceof gz.e1) {
            g(context, user, (gz.e1) item, true);
        }
    }

    public final void b(Context context, j0.a item, User user) {
        Intent a11;
        kotlin.jvm.internal.u.j(context, "context");
        kotlin.jvm.internal.u.j(item, "item");
        if (item instanceof gz.b) {
            c(context, user, item.c(), true);
            return;
        }
        boolean z5 = item instanceof gz.d;
        ch.d dVar = this.f42140b;
        if (z5) {
            context.startActivity(((ah.l) dVar.v()).o(0, context, user, item.c()));
        } else if (item instanceof gz.f) {
            a3.b b10 = dVar.b();
            DateTime c11 = ((gz.f) item).c();
            b10.getClass();
            context.startActivity(a3.b.c(context, user, c11, false));
        } else if (item instanceof gz.h) {
            gz.h hVar = (gz.h) item;
            if (wr.b.c(FeatureFlag.f39133u)) {
                ah.i j5 = dVar.j();
                long q11 = user.q();
                Period period = Period.f43723h;
                DateTime dateTime = hVar.c();
                j5.getClass();
                kotlin.jvm.internal.u.j(dateTime, "dateTime");
                a11 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.fever.ui.BodyTemperatureActivity").putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, q11).putExtra("period", period).putExtra("date", dateTime);
                kotlin.jvm.internal.u.i(a11, "putExtra(...)");
            } else {
                MeasureDetailActivity.a aVar = MeasureDetailActivity.f41733o;
                long q12 = user.q();
                BodyTemperatureMeasureDetailScreen a12 = this.f42139a.a(user);
                Period.a aVar2 = Period.f43718c;
                long f11 = hVar.f();
                aVar.getClass();
                a11 = MeasureDetailActivity.a.a(context, q12, a12, f11);
            }
            context.startActivity(a11);
        } else if (item instanceof gz.j) {
            e(context, o70.a.d(user), ((gz.j) item).f(), false);
        } else if (item instanceof gz.l) {
            ch.c v11 = dVar.v();
            DateTime date = ((gz.l) item).c();
            ((ah.l) v11).getClass();
            kotlin.jvm.internal.u.j(date, "date");
            Intent putExtra = ah.a.a(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.wiscale2.heart.heartrate.HeartRateDayActivity", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", date);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            context.startActivity(putExtra);
        } else if (item instanceof gz.t) {
            ch.c v12 = dVar.v();
            Long valueOf = Long.valueOf(user.q());
            Long valueOf2 = Long.valueOf(((gz.t) item).o());
            ((ah.l) v12).getClass();
            Intent putExtra2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.ecg.details.EcgListActivity").putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, valueOf).putExtra("ecg_id", valueOf2).putExtra("ws_measure_groupId", (Serializable) null).putExtra("local_measure_group_id", (Serializable) null);
            kotlin.jvm.internal.u.i(putExtra2, "putExtra(...)");
            context.startActivity(putExtra2);
        } else if (item instanceof gz.y) {
            d(context, item.c(), user.q(), MeasureCategory.f42342d);
        } else if (item instanceof gz.w) {
            d(context, item.c(), user.q(), MeasureCategory.f42343e);
        } else if (item instanceof gz.a0) {
            ch.c v13 = dVar.v();
            long g11 = ((gz.a0) item).g();
            long q13 = user.q();
            ((ah.l) v13).getClass();
            Intent putExtra3 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.wiscale2.heart.HeartDetailActivity").putExtra("measure_group_id", g11).putExtra("measure_type", 1).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, q13).putExtra("EXTRA_SHOULD_SHOW_LIST", true);
            kotlin.jvm.internal.u.i(putExtra3, "putExtra(...)");
            context.startActivity(putExtra3);
        } else if (item instanceof gz.c0) {
            ch.c v14 = dVar.v();
            long j11 = ((gz.c0) item).j();
            ((ah.l) v14).getClass();
            Intent putExtra4 = ah.a.a(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.ecg.heartsound.HeartSoundListActivity", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("ecg_id", j11);
            kotlin.jvm.internal.u.i(putExtra4, "putExtra(...)");
            context.startActivity(putExtra4);
        } else if (item instanceof gz.g0) {
            c(context, user, item.c(), false);
        } else if (item instanceof gz.l0) {
            d(context, item.c(), user.q(), MeasureCategory.f42341c);
        } else if (item instanceof gz.n0) {
            f(context, user, item.c());
        } else if (item instanceof gz.r0) {
            context.startActivity(((ah.l) dVar.v()).o(2, context, user, ((gz.r0) item).c()));
        } else if (item instanceof gz.y0) {
            f(context, user, item.c());
        } else if (item instanceof gz.t0) {
            e(context, o70.a.d(user), ((gz.t0) item).f(), true);
        } else if (item instanceof gz.w0) {
            com.withings.user.core.models.User d11 = o70.a.d(user);
            ah.f l5 = dVar.l();
            DateTime date2 = ((gz.w0) item).c();
            l5.getClass();
            kotlin.jvm.internal.u.j(date2, "date");
            Intent putExtra5 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity").putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, d11).putExtra("date", date2);
            kotlin.jvm.internal.u.i(putExtra5, "putExtra(...)");
            context.startActivity(putExtra5);
        } else if (item instanceof gz.c1) {
            ah.b I = dVar.I();
            DateTime c12 = ((gz.c1) item).c();
            I.getClass();
            context.startActivity(ah.b.e(context, user, c12, false));
        } else if (item instanceof gz.e1) {
            g(context, user, (gz.e1) item, false);
        } else if (item instanceof gz.i1) {
            ch.k u11 = dVar.u();
            long e11 = ((gz.i1) item).e();
            ((ah.c0) u11).getClass();
            Intent putExtra6 = ah.a.a(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.wiscale2.vo2max.view.Vo2maxActivity", "key_user", user).putExtra("key_initial_measure_id", e11);
            kotlin.jvm.internal.u.i(putExtra6, "putExtra(...)");
            context.startActivity(putExtra6);
        } else if (item instanceof gz.k1) {
            dVar.b().getClass();
            context.startActivity(a3.b.h(context, user));
        } else if (item instanceof gz.m1) {
            gz.m1 m1Var = (gz.m1) item;
            ah.o n11 = dVar.n();
            Long l6 = m1Var.l();
            Integer valueOf3 = Integer.valueOf(m1Var.f());
            n11.getClass();
            Intent putExtra7 = ah.a.a(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.wiscale2.activity.workout.ui.detail.WorkoutListActivity", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("initial_track_id", l6).putExtra("initial_category_id", valueOf3);
            kotlin.jvm.internal.u.i(putExtra7, "putExtra(...)");
            context.startActivity(putExtra7);
        } else if (item instanceof gz.n) {
            long q14 = user.q();
            dVar.j().getClass();
            Intent putExtra8 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.wiscale2.coretemperature.ui.ExploreCoreTemperatureActivity").putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, q14);
            kotlin.jvm.internal.u.i(putExtra8, "putExtra(...)");
            context.startActivity(putExtra8);
        } else if (item instanceof gz.e0) {
            dVar.getHeight().getClass();
            Intent a13 = ah.a.a(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.details.height.HeightActivity", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
            kotlin.jvm.internal.u.i(a13, "putExtra(...)");
            context.startActivity(a13);
        } else if (item instanceof gz.q) {
            long q15 = user.q();
            dVar.A().getClass();
            context.startActivity(ah.f.c(context, q15));
        } else if (item instanceof gz.p0) {
            long q16 = user.q();
            DateTime c13 = item.c();
            dVar.y().getClass();
            context.startActivity(ah.w.a(context, c13, q16));
        } else if (item instanceof gz.a1) {
            long q17 = user.q();
            DateTime c14 = item.c();
            dVar.y().getClass();
            context.startActivity(ah.w.a(context, c14, q17));
        } else if (item instanceof gz.g1) {
            long q18 = user.q();
            DateTime c15 = item.c();
            dVar.y().getClass();
            context.startActivity(ah.w.a(context, c15, q18));
        } else if (item instanceof gz.i0) {
            long q19 = user.q();
            DateTime c16 = item.c();
            dVar.y().getClass();
            context.startActivity(ah.w.a(context, c16, q19));
        }
    }
}
