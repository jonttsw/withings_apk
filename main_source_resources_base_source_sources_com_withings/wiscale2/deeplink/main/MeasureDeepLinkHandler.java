package com.withings.wiscale2.deeplink.main;

import android.content.Context;
import android.content.Intent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.core.data.aggregate.ActivityAggregate;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.ecg.details.EcgListActivity;
import com.withings.ecg.heartsound.HeartSoundListActivity;
import com.withings.graph.GraphPeriod;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.manualLogging.ui.common.LogType;
import com.withings.manualLogging.ui.feature.addNote.AddManualLogActivity;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.weight.presentation.ui.BodyCompositionActivity;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.ActivityActivity;
import com.withings.wiscale2.heart.HeartDetailActivity;
import com.withings.wiscale2.heart.HeartHistoryActivity;
import com.withings.wiscale2.heart.heartrate.HeartRateDayActivity;
import com.withings.wiscale2.measure.list.MeasureListActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepActivity;
import com.withings.wiscale2.spo2.Spo2Activity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MeasuresDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/deeplink/main/MeasureDeepLinkHandler;", "", com.huawei.hms.feature.dynamic.e.e.f28630a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class MeasureDeepLinkHandler {

    /* renamed from: b  reason: collision with root package name */
    public static final e f50676b;

    /* renamed from: c  reason: collision with root package name */
    private static final /* synthetic */ MeasureDeepLinkHandler[] f50677c;

    /* renamed from: d  reason: collision with root package name */
    private static final /* synthetic */ sm0.a f50678d;

    /* renamed from: a  reason: collision with root package name */
    private final int f50679a;

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class a extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            MeasuresGroup measuresGroup;
            Long l5;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            Long l6 = null;
            if (dateTime != null) {
                measuresGroup = d(user, dateTime);
            } else {
                measuresGroup = null;
            }
            EcgListActivity.a aVar = EcgListActivity.f38008n;
            long q11 = user.q();
            if (measuresGroup != null) {
                l5 = Long.valueOf(measuresGroup.getId());
            } else {
                l5 = null;
            }
            if (measuresGroup != null) {
                l6 = Long.valueOf(measuresGroup.getWsId());
            }
            return EcgListActivity.a.a(aVar, context, q11, null, l6, l5, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MeasuresDeepLinkHandler.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler$getMeasureForDate$1", f = "MeasuresDeepLinkHandler.kt", l = {491}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super MeasuresGroup>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f50680a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f50681b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ DateTime f50682c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MeasureDeepLinkHandler f50683d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(User user, DateTime dateTime, MeasureDeepLinkHandler measureDeepLinkHandler, qm0.d<? super a0> dVar) {
            super(2, dVar);
            this.f50681b = user;
            this.f50682c = dateTime;
            this.f50683d = measureDeepLinkHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a0(this.f50681b, this.f50682c, this.f50683d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super MeasuresGroup> dVar) {
            return ((a0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object c11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f50680a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                    c11 = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                xw.b bVar = new xw.b();
                sw.a z5 = sw.a.z();
                kotlin.jvm.internal.u.i(z5, "get(...)");
                zx.v vVar = new zx.v(z5);
                sw.a z11 = sw.a.z();
                kotlin.jvm.internal.u.i(z11, "get(...)");
                fy.l lVar = new fy.l(new dy.d(vVar, new zx.w(z11, bVar), bVar), bVar);
                long q11 = this.f50681b.q();
                DateTime dateTime = this.f50682c;
                this.f50680a = 1;
                c11 = fy.l.c(lVar, q11, new Long(dateTime.minusMinutes(1).getMillis()), new Long(dateTime.getMillis()), false, new int[]{this.f50683d.e()}, this, 24);
                if (c11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            ky.d dVar = (ky.d) kotlin.collections.x.U((List) c11);
            if (dVar != null) {
                return hy.g.e(dVar);
            }
            return null;
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class b extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            GraphPeriod graphPeriod;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            if (period != null) {
                graphPeriod = h20.a.c(period);
            } else {
                graphPeriod = null;
            }
            Intent putExtra = ah.a.a(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.weight.presentation.ui.WeightActivity", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("period", graphPeriod);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class c extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            BodyCompositionActivity.a aVar = BodyCompositionActivity.f47115k;
            int e11 = e();
            if (dateTime == null) {
                dateTime = DateTime.now();
            }
            kotlin.jvm.internal.u.g(dateTime);
            return BodyCompositionActivity.a.a(aVar, context, user, dateTime, Integer.valueOf(e11));
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class d extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            return ActivityActivity.a.a(ActivityActivity.f48218t, context, user, new DateTime(dateTime), period);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    public static final class e {
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class f extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            ah.f A = intentBuilder.A();
            long q11 = user.q();
            A.getClass();
            return ah.f.c(context, q11);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class g extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            return ActivityActivity.a.a(ActivityActivity.f48218t, context, user, new DateTime(dateTime), period);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class h extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            MeasuresGroup measuresGroup;
            Long l5;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            Long l6 = null;
            if (dateTime != null) {
                measuresGroup = d(user, dateTime);
            } else {
                measuresGroup = null;
            }
            EcgListActivity.a aVar = EcgListActivity.f38008n;
            long q11 = user.q();
            if (measuresGroup != null) {
                l5 = Long.valueOf(measuresGroup.getId());
            } else {
                l5 = null;
            }
            if (measuresGroup != null) {
                l6 = Long.valueOf(measuresGroup.getWsId());
            }
            return EcgListActivity.a.a(aVar, context, q11, null, l6, l5, 4);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class i extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            MeasuresGroup measuresGroup;
            Long l5;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            Long l6 = null;
            if (dateTime != null) {
                measuresGroup = d(user, dateTime);
            } else {
                measuresGroup = null;
            }
            EcgListActivity.a aVar = EcgListActivity.f38008n;
            long q11 = user.q();
            if (measuresGroup != null) {
                l5 = Long.valueOf(measuresGroup.getId());
            } else {
                l5 = null;
            }
            if (measuresGroup != null) {
                l6 = Long.valueOf(measuresGroup.getWsId());
            }
            return EcgListActivity.a.a(aVar, context, q11, null, l6, l5, 4);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class j extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            return ActivityActivity.a.a(ActivityActivity.f48218t, context, user, new DateTime(dateTime), period);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class k extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            BodyCompositionActivity.a aVar = BodyCompositionActivity.f47115k;
            int e11 = e();
            if (dateTime == null) {
                dateTime = DateTime.now();
            }
            kotlin.jvm.internal.u.g(dateTime);
            return BodyCompositionActivity.a.a(aVar, context, user, dateTime, Integer.valueOf(e11));
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class l extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            ActivityAggregate lastAggregateWithAverageHR = ActivityAggregateManager.Companion.get().getLastAggregateWithAverageHR(user.q());
            if (lastAggregateWithAverageHR != null) {
                String day = lastAggregateWithAverageHR.getDay();
                HeartRateDayActivity.a aVar = HeartRateDayActivity.f57498p;
                DateTime dateTime2 = new DateTime(day);
                aVar.getClass();
                return HeartRateDayActivity.a.a(context, user, dateTime2);
            }
            int i11 = AddManualLogActivity.f40697k;
            return AddManualLogActivity.a.a(context, user.q(), LogType.f40694b, null, null, null, 56);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class m extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            Intent intent;
            MeasuresGroup d11;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            if (dateTime != null && (d11 = d(user, dateTime)) != null) {
                intent = HeartDetailActivity.D3(context, d11, 1, user.q());
            } else {
                intent = null;
            }
            if (intent == null) {
                MeasureListActivity.f58492n.getClass();
                return MeasureListActivity.a.a(context, user.q(), new int[]{11}, C1987R.string._HEART_RATE_);
            }
            return intent;
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class n extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            MeasuresGroup measuresGroup;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            Long l5 = null;
            if (dateTime != null) {
                measuresGroup = d(user, dateTime);
            } else {
                measuresGroup = null;
            }
            HeartSoundListActivity.a aVar = HeartSoundListActivity.f38402k;
            if (measuresGroup != null) {
                l5 = Long.valueOf(measuresGroup.getId());
            }
            aVar.getClass();
            Intent putExtra = new Intent(context, HeartSoundListActivity.class).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("ecg_id", l5);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class o extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            BodyCompositionActivity.a aVar = BodyCompositionActivity.f47115k;
            int e11 = e();
            if (dateTime == null) {
                dateTime = DateTime.now();
            }
            kotlin.jvm.internal.u.g(dateTime);
            return BodyCompositionActivity.a.a(aVar, context, user, dateTime, Integer.valueOf(e11));
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class p extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            ch.c v11 = intentBuilder.v();
            DateTime now = DateTime.now();
            kotlin.jvm.internal.u.i(now, "now(...)");
            return ((ah.l) v11).o(2, context, user, now);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class q extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            Object runBlocking$default;
            Measure measureForType;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            if (period != Period.f43721f) {
                runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new com.withings.wiscale2.deeplink.main.a(user, this, null), 1, null);
                MeasuresGroup measuresGroup = (MeasuresGroup) runBlocking$default;
                if (measuresGroup != null && (measureForType = measuresGroup.getMeasureForType(9)) != null) {
                    HeartHistoryActivity.a aVar = HeartHistoryActivity.f57022w;
                    DateTime dateTime2 = new DateTime(measureForType.getDate());
                    if (period == null) {
                        period = Period.f43723h;
                    }
                    aVar.getClass();
                    return HeartHistoryActivity.a.a(context, user, dateTime2, period);
                }
            }
            int i11 = AddManualLogActivity.f40697k;
            return AddManualLogActivity.a.a(context, user.q(), LogType.f40694b, null, null, null, 56);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class r extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            Intent intent;
            MeasuresGroup d11;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            if (dateTime != null && (d11 = d(user, dateTime)) != null) {
                intent = HeartDetailActivity.D3(context, d11, 0, user.q());
            } else {
                intent = null;
            }
            if (intent == null) {
                HeartHistoryActivity.a aVar = HeartHistoryActivity.f57022w;
                if (dateTime == null) {
                    dateTime = DateTime.now();
                }
                kotlin.jvm.internal.u.g(dateTime);
                if (period == null) {
                    period = Period.f43723h;
                }
                aVar.getClass();
                return HeartHistoryActivity.a.a(context, user, dateTime, period);
            }
            return intent;
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class s extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            SleepActivity.a aVar = SleepActivity.f60569q;
            com.withings.user.core.models.User d11 = o70.a.d(user);
            DateTime dateTime2 = new DateTime(dateTime);
            if (period == null) {
                period = Period.f43721f;
            }
            aVar.getClass();
            return SleepActivity.a.a(context, d11, dateTime2, period);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class t extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            SleepActivity.a aVar = SleepActivity.f60569q;
            com.withings.user.core.models.User d11 = o70.a.d(user);
            DateTime dateTime2 = new DateTime(dateTime);
            if (period == null) {
                period = Period.f43723h;
            }
            aVar.getClass();
            return SleepActivity.a.a(context, d11, dateTime2, period);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class u extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            SleepActivity.a aVar = SleepActivity.f60569q;
            com.withings.user.core.models.User d11 = o70.a.d(user);
            DateTime dateTime2 = new DateTime(dateTime);
            if (period == null) {
                period = Period.f43722g;
            }
            aVar.getClass();
            return SleepActivity.a.a(context, d11, dateTime2, period);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class v extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            String str;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            ActivityAggregateManager activityAggregateManager = ActivityAggregateManager.Companion.get();
            long q11 = user.q();
            DateTime h11 = user.h();
            if (dateTime == null) {
                dateTime = DateTime.now();
            }
            ActivityAggregate lastAggregateWithAverageSpo2 = activityAggregateManager.getLastAggregateWithAverageSpo2(q11, h11, dateTime);
            Spo2Activity.a aVar = Spo2Activity.f61615q;
            if (lastAggregateWithAverageSpo2 != null) {
                str = lastAggregateWithAverageSpo2.getDay();
            } else {
                str = null;
            }
            return Spo2Activity.a.a(aVar, context, user, new DateTime(str));
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class w extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            ActivityAggregate lastAggregateWithSteps = ActivityAggregateManager.Companion.get().getLastAggregateWithSteps(user.q());
            if (lastAggregateWithSteps != null) {
                ActivityActivity.a aVar = ActivityActivity.f48218t;
                DateTime midnight = lastAggregateWithSteps.getMidnight();
                kotlin.jvm.internal.u.i(midnight, "getMidnight(...)");
                if (period == null) {
                    period = Period.f43721f;
                }
                return ActivityActivity.a.a(aVar, context, user, midnight, period);
            }
            int i11 = AddManualLogActivity.f40697k;
            return AddManualLogActivity.a.a(context, user.q(), LogType.f40694b, null, null, null, 56);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class x extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            ActivityAggregate lastAggregateWithSteps = ActivityAggregateManager.Companion.get().getLastAggregateWithSteps(user.q());
            if (lastAggregateWithSteps != null) {
                ActivityActivity.a aVar = ActivityActivity.f48218t;
                DateTime midnight = lastAggregateWithSteps.getMidnight();
                kotlin.jvm.internal.u.i(midnight, "getMidnight(...)");
                if (period == null) {
                    period = Period.f43723h;
                }
                return ActivityActivity.a.a(aVar, context, user, midnight, period);
            }
            int i11 = AddManualLogActivity.f40697k;
            return AddManualLogActivity.a.a(context, user.q(), LogType.f40694b, null, null, null, 56);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class y extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            ActivityAggregate lastAggregateWithSteps = ActivityAggregateManager.Companion.get().getLastAggregateWithSteps(user.q());
            if (lastAggregateWithSteps != null) {
                ActivityActivity.a aVar = ActivityActivity.f48218t;
                DateTime midnight = lastAggregateWithSteps.getMidnight();
                kotlin.jvm.internal.u.i(midnight, "getMidnight(...)");
                if (period == null) {
                    period = Period.f43722g;
                }
                return ActivityActivity.a.a(aVar, context, user, midnight, period);
            }
            int i11 = AddManualLogActivity.f40697k;
            return AddManualLogActivity.a.a(context, user.q(), LogType.f40694b, null, null, null, 56);
        }
    }

    /* compiled from: MeasuresDeepLinkHandler.kt */
    /* loaded from: classes4.dex */
    static final class z extends MeasureDeepLinkHandler {
        @Override // com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler
        public final Intent b(Context context, User user, DateTime dateTime, Period period, n20.f pwvPlanUseCase, ch.d intentBuilder) {
            GraphPeriod graphPeriod;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(pwvPlanUseCase, "pwvPlanUseCase");
            kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
            if (period != null) {
                graphPeriod = h20.a.c(period);
            } else {
                graphPeriod = null;
            }
            Intent putExtra = ah.a.a(context, new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), "com.withings.weight.presentation.ui.WeightActivity", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("period", graphPeriod);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.withings.wiscale2.deeplink.main.MeasureDeepLinkHandler$e, java.lang.Object] */
    static {
        MeasureDeepLinkHandler[] measureDeepLinkHandlerArr = {new MeasureDeepLinkHandler(0, 54, "Spo2MeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(1, 82, "HeartRateMeasurementDeepLinkHandler"), new MeasureDeepLinkHandler(2, 11, "HeartRateMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(3, 9, "PdiasMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(4, 10, "PsystMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(5, 1, "WeightMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(6, 22, "BmiMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(7, 8, "FatMassMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(8, 76, "MuscleMassMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(9, 88, "BoneMassMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(10, 44, "SleepMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(11, 6, "SleepWeekMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(12, 7, "SleepMontMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(13, 36, "StepsMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(14, 4, "StepsWeekMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(15, 5, "StepsMonthMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(16, 37, "ElevationMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(17, 38, "CaloriesMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(18, 40, "DistanceMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(19, 130, "AfibMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(20, 128, "EcgMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(21, 128, "EcgDeepLinkHandler"), new MeasureDeepLinkHandler(22, ConstantsWs.MEASURE_TYPE_VHD_RESULT, "HeartSoundMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(23, 91, "PWVMeasuresDeepLinkHandler"), new MeasureDeepLinkHandler(24, ConstantsWs.MEASURE_TYPE_MENSTRUATION_FLOW, "CycleTrackingMeasuresDeepLinkHandler")};
        f50677c = measureDeepLinkHandlerArr;
        f50678d = sm0.b.a(measureDeepLinkHandlerArr);
        f50676b = new Object();
    }

    private MeasureDeepLinkHandler() {
        throw null;
    }

    public MeasureDeepLinkHandler(int i11, int i12, String str) {
        this.f50679a = i12;
    }

    public static sm0.a<MeasureDeepLinkHandler> a() {
        return f50678d;
    }

    public static MeasureDeepLinkHandler valueOf(String str) {
        return (MeasureDeepLinkHandler) Enum.valueOf(MeasureDeepLinkHandler.class, str);
    }

    public static MeasureDeepLinkHandler[] values() {
        return (MeasureDeepLinkHandler[]) f50677c.clone();
    }

    public abstract Intent b(Context context, User user, DateTime dateTime, Period period, n20.f fVar, ch.d dVar);

    protected final MeasuresGroup d(User user, DateTime date) {
        Object runBlocking$default;
        kotlin.jvm.internal.u.j(date, "date");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new a0(user, date, this, null), 1, null);
        return (MeasuresGroup) runBlocking$default;
    }

    public final int e() {
        return this.f50679a;
    }
}
