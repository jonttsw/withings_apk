package com.withings.health.score.android.webservices.repository;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.withings.health.score.android.webservices.model.ScoresWs;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import java.text.SimpleDateFormat;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import pt.d;
import pt.f;
import pt.g;
import qt.c;
import s00.a;
import s00.b;
/* compiled from: RetrofitHealthScoreRemoteRepository.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b#\u0010$J\u001b\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/withings/health/score/android/webservices/repository/RetrofitHealthScoreRemoteRepository;", "Lqt/c;", "Lcom/withings/health/score/android/webservices/repository/ScoreResponse;", "", NavigationArguments.USER_ID, "Lpt/d;", "toUserHealthScore", "(Lcom/withings/health/score/android/webservices/repository/ScoreResponse;J)Lpt/d;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lqt/c;", FirebaseAnalytics.Param.SCORE, "Lnm0/y;", "saveScore", "(Lpt/d;Lqm0/d;)Ljava/lang/Object;", "", "scores", "Lpt/a;", "saveScores", "(JLjava/util/List;Lqm0/d;)Ljava/lang/Object;", "lastUpdate", "getScores", "(JJLqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/c;", "gsonHandler", "Ls00/c;", "Ls00/a;", "Lcom/withings/health/score/android/webservices/repository/HealthScoreRetrofit1Api;", "Lcom/withings/health/score/android/webservices/repository/HealthScoreRetrofit2Api;", "compatWS", "Ls00/a;", "<init>", "(Ls00/b;Ls00/c;Ljava/lang/String;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RetrofitHealthScoreRemoteRepository implements c {
    private final a<HealthScoreRetrofit1Api, HealthScoreRetrofit2Api> compatWS;
    private final b compatWebservicesFactory;
    private final s00.c gsonHandler;

    public RetrofitHealthScoreRemoteRepository(b compatWebservicesFactory, s00.c gsonHandler, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        u.j(gsonHandler, "gsonHandler");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.gsonHandler = gsonHandler;
        this.compatWS = compatWebservicesFactory.a(str, HealthScoreRetrofit1Api.class, HealthScoreRetrofit2Api.class);
    }

    private final d toUserHealthScore(ScoreResponse scoreResponse, long j5) {
        return new d(j5, new LocalDate(new SimpleDateFormat("yyyy-MM-dd").parse(scoreResponse.getDate())), new DateTime(scoreResponse.getModified() * 1000), scoreResponse.getHealthImprovement(), new pt.b(scoreResponse.getActivity(), Double.valueOf(scoreResponse.getActiveMinutes()), Double.valueOf(scoreResponse.getSteps())), new pt.c(scoreResponse.getBody(), Double.valueOf(scoreResponse.getBodyComposition()), Double.valueOf(scoreResponse.getWeightEngagement()), Double.valueOf(scoreResponse.getBmi())), new f(scoreResponse.getHeart(), Double.valueOf(scoreResponse.getEcgEngagement()), Double.valueOf(scoreResponse.getVascularAge()), Double.valueOf(scoreResponse.getNightHr()), Double.valueOf(scoreResponse.getBloodPressure()), Double.valueOf(scoreResponse.getBloodPressureBurden()), Double.valueOf(scoreResponse.getBpmEngagement()), Double.valueOf(scoreResponse.getEcgAfib()), Double.valueOf(scoreResponse.getAfibBurden())), new g(scoreResponse.getSleep(), Double.valueOf(scoreResponse.getSleepApneaBurden()), Double.valueOf(scoreResponse.getSleepQuality()), Double.valueOf(scoreResponse.getSleepMonitoring())), scoreResponse.getAlgo(), true, 1024);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c6 A[LOOP:0: B:20:0x00c0->B:22:0x00c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00de  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x009f -> B:19:0x00a3). Please submit an issue!!! */
    @Override // qt.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getScores(long r21, long r23, qm0.d<? super java.util.List<pt.d>> r25) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.health.score.android.webservices.repository.RetrofitHealthScoreRemoteRepository.getScores(long, long, qm0.d):java.lang.Object");
    }

    public Object saveScore(d dVar, qm0.d<? super y> dVar2) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Integer num9;
        Integer num10;
        Integer num11;
        Integer num12;
        Integer num13;
        Integer num14;
        Integer num15;
        Integer num16;
        Integer num17;
        Integer num18;
        Integer num19;
        Double a11;
        Double e11;
        Double d11;
        Double b10;
        Double c11;
        Double g11;
        Double i11;
        Double f11;
        Double c12;
        Double d12;
        Double b11;
        Double a12;
        Double d13;
        Double b12;
        Double a13;
        Double c13;
        DateTime dateTime = dVar.e().toDateTime(new LocalTime(12, 0), DateTimeZone.UTC);
        long k11 = dVar.k();
        int f12 = (int) dVar.f();
        pt.b b13 = dVar.b();
        Integer num20 = null;
        if (b13 != null) {
            num = new Integer((int) b13.b());
        } else {
            num = null;
        }
        pt.b b14 = dVar.b();
        if (b14 != null && (c13 = b14.c()) != null) {
            num2 = new Integer((int) c13.doubleValue());
        } else {
            num2 = null;
        }
        pt.b b15 = dVar.b();
        if (b15 != null && (a13 = b15.a()) != null) {
            num3 = new Integer((int) a13.doubleValue());
        } else {
            num3 = null;
        }
        pt.c d14 = dVar.d();
        if (d14 != null) {
            num4 = new Integer((int) d14.c());
        } else {
            num4 = null;
        }
        pt.c d15 = dVar.d();
        if (d15 != null && (b12 = d15.b()) != null) {
            num5 = new Integer((int) b12.doubleValue());
        } else {
            num5 = null;
        }
        pt.c d16 = dVar.d();
        if (d16 != null && (d13 = d16.d()) != null) {
            num6 = new Integer((int) d13.doubleValue());
        } else {
            num6 = null;
        }
        pt.c d17 = dVar.d();
        if (d17 != null && (a12 = d17.a()) != null) {
            num7 = new Integer((int) a12.doubleValue());
        } else {
            num7 = null;
        }
        g i12 = dVar.i();
        if (i12 != null) {
            num8 = new Integer((int) i12.a());
        } else {
            num8 = null;
        }
        g i13 = dVar.i();
        if (i13 != null && (b11 = i13.b()) != null) {
            num9 = new Integer((int) b11.doubleValue());
        } else {
            num9 = null;
        }
        g i14 = dVar.i();
        if (i14 != null && (d12 = i14.d()) != null) {
            num10 = new Integer((int) d12.doubleValue());
        } else {
            num10 = null;
        }
        g i15 = dVar.i();
        if (i15 != null && (c12 = i15.c()) != null) {
            num11 = new Integer((int) c12.doubleValue());
        } else {
            num11 = null;
        }
        f g12 = dVar.g();
        if (g12 != null) {
            num12 = new Integer((int) g12.h());
        } else {
            num12 = null;
        }
        f g13 = dVar.g();
        if (g13 != null && (f11 = g13.f()) != null) {
            num13 = new Integer((int) f11.doubleValue());
        } else {
            num13 = null;
        }
        f g14 = dVar.g();
        if (g14 != null && (i11 = g14.i()) != null) {
            num14 = new Integer((int) i11.doubleValue());
        } else {
            num14 = null;
        }
        f g15 = dVar.g();
        if (g15 != null && (g11 = g15.g()) != null) {
            num15 = new Integer((int) g11.doubleValue());
        } else {
            num15 = null;
        }
        f g16 = dVar.g();
        if (g16 != null && (c11 = g16.c()) != null) {
            num16 = new Integer((int) c11.doubleValue());
        } else {
            num16 = null;
        }
        f g17 = dVar.g();
        if (g17 != null && (b10 = g17.b()) != null) {
            num17 = new Integer((int) b10.doubleValue());
        } else {
            num17 = null;
        }
        f g18 = dVar.g();
        if (g18 != null && (d11 = g18.d()) != null) {
            num18 = new Integer((int) d11.doubleValue());
        } else {
            num18 = null;
        }
        f g19 = dVar.g();
        if (g19 != null && (e11 = g19.e()) != null) {
            num19 = new Integer((int) e11.doubleValue());
        } else {
            num19 = null;
        }
        f g21 = dVar.g();
        if (g21 != null && (a11 = g21.a()) != null) {
            num20 = new Integer((int) a11.doubleValue());
        }
        String json = this.gsonHandler.b().create().getAdapter(ScoresWs.class).toJson(new ScoresWs(f12, num, num2, num3, num4, num5, num6, num7, num12, num13, num14, num15, num16, num17, num18, num19, num20, num8, num9, num10, num11));
        Object d18 = a.d(this.compatWS, new RetrofitHealthScoreRemoteRepository$saveScore$2(k11, dateTime, json), new RetrofitHealthScoreRemoteRepository$saveScore$3(k11, dateTime, json, null), null, false, dVar2, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
        if (d18 == CoroutineSingletons.f76214a) {
            return d18;
        }
        return y.f85009a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|(2:3|(14:5|6|7|(1:(4:10|11|12|13)(2:48|49))(14:50|(42:53|(1:55)(1:167)|56|(1:166)(1:60)|61|(1:165)(1:65)|66|(1:68)(1:164)|69|(1:163)(1:73)|74|(1:162)(1:78)|79|(1:161)(1:83)|84|(1:86)(1:160)|87|(1:159)(1:91)|92|(1:158)(1:96)|97|(1:157)(1:101)|102|(1:104)(1:156)|105|(1:155)(1:109)|110|(1:154)(1:114)|115|(1:153)(1:119)|120|(1:152)(1:124)|125|(1:151)(1:129)|130|(1:150)(1:134)|135|(1:149)(1:139)|140|(2:147|148)(2:144|145)|146|51)|168|169|170|171|172|173|174|175|176|177|178|(1:180)(1:181))|14|15|16|(2:18|(3:20|(4:23|(3:25|26|27)(1:29)|28|21)|30)(1:31))|32|(1:34)|35|(1:37)(1:41)|38|39))|191|6|7|(0)(0)|14|15|16|(0)|32|(0)|35|(0)(0)|38|39|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0314, code lost:
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.util.List] */
    @Override // qt.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object saveScores(long r43, java.util.List<pt.d> r45, qm0.d<? super pt.a> r46) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.health.score.android.webservices.repository.RetrofitHealthScoreRemoteRepository.saveScores(long, java.util.List, qm0.d):java.lang.Object");
    }

    public c withSyncContext(String str) {
        return new RetrofitHealthScoreRemoteRepository(this.compatWebservicesFactory, this.gsonHandler, str);
    }

    public /* synthetic */ RetrofitHealthScoreRemoteRepository(b bVar, s00.c cVar, String str, int i11, m mVar) {
        this(bVar, cVar, (i11 & 4) != 0 ? null : str);
    }
}
