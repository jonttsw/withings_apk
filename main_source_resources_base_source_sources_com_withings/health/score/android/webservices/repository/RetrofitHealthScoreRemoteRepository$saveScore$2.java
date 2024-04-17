package com.withings.health.score.android.webservices.repository;

import com.withings.library.healthscore.HealthScoreService;
import hn.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import org.joda.time.DateTime;
import ym0.l;
/* compiled from: RetrofitHealthScoreRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/withings/health/score/android/webservices/repository/HealthScoreRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitHealthScoreRemoteRepository$saveScore$2 extends w implements l<HealthScoreRetrofit1Api, Object> {
    final /* synthetic */ String $scoresString;
    final /* synthetic */ DateTime $timestamp;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitHealthScoreRemoteRepository$saveScore$2(long j5, DateTime dateTime, String str) {
        super(1);
        this.$userId = j5;
        this.$timestamp = dateTime;
        this.$scoresString = str;
    }

    @Override // ym0.l
    public final Object invoke(HealthScoreRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        long j5 = this.$userId;
        DateTime timestamp = this.$timestamp;
        u.i(timestamp, "$timestamp");
        long j11 = a.j(timestamp);
        int versionCode = HealthScoreService.Companion.getVersionCode();
        String scoresString = this.$scoresString;
        u.i(scoresString, "$scoresString");
        return withApiForAccount.createScores(j5, j11, versionCode, scoresString);
    }
}
