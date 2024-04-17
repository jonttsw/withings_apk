package com.withings.badge.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.webservices.legacy.lastupdate.LastUpdateCheckerKt;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.joda.time.DateTime;
import zh.a;
import zh.b;
/* compiled from: GetUserBadges.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b \u0010!J/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/withings/badge/webservices/GetUserBadges;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "", "", "", "Lai/a;", "badgesByType", "convertToList", "(Ljava/util/Map;)Ljava/util/List;", "", "localLastUpdate", "Lorg/joda/time/DateTime;", "remoteLastUpdate", "", "shouldMakeCallForLastUpdates", "(JLorg/joda/time/DateTime;)Z", "Lnm0/y;", "run", "()V", "Lzh/b;", "remoteRepository", "Lzh/b;", "Lzh/a;", "localRepository", "Lzh/a;", "Lcom/withings/badge/webservices/BadgeImageDownloader;", "imageDownloader", "Lcom/withings/badge/webservices/BadgeImageDownloader;", NavigationArguments.USER_ID, "J", "ignoreLastUpdate", "Z", "<init>", "(Lzh/b;Lzh/a;Lcom/withings/badge/webservices/BadgeImageDownloader;JZ)V", "badge_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetUserBadges extends BaseSyncAction {
    public static final int $stable = 8;
    private final boolean ignoreLastUpdate;
    private final BadgeImageDownloader imageDownloader;
    private final a localRepository;
    private final b remoteRepository;
    private final long userId;

    public GetUserBadges(b remoteRepository, a localRepository, BadgeImageDownloader imageDownloader, long j5, boolean z5) {
        u.j(remoteRepository, "remoteRepository");
        u.j(localRepository, "localRepository");
        u.j(imageDownloader, "imageDownloader");
        this.remoteRepository = remoteRepository;
        this.localRepository = localRepository;
        this.imageDownloader = imageDownloader;
        this.userId = j5;
        this.ignoreLastUpdate = z5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ai.a> convertToList(Map<Integer, ? extends List<ai.a>> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, ? extends List<ai.a>> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            List<ai.a> value = entry.getValue();
            ArrayList arrayList2 = new ArrayList(x.y(value, 10));
            for (ai.a aVar : value) {
                arrayList2.add(ai.a.a(aVar, this.userId, intValue));
            }
            x.n(arrayList2, arrayList);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldMakeCallForLastUpdates(long j5, DateTime dateTime) {
        if (j5 != 0 && dateTime != null && !LastUpdateCheckerKt.shouldMakeCallForLastUpdate(dateTime, j5)) {
            return false;
        }
        return true;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        BuildersKt__BuildersKt.runBlocking$default(null, new GetUserBadges$run$1(this, null), 1, null);
    }

    public /* synthetic */ GetUserBadges(b bVar, a aVar, BadgeImageDownloader badgeImageDownloader, long j5, boolean z5, int i11, m mVar) {
        this(bVar, aVar, badgeImageDownloader, j5, (i11 & 16) != 0 ? false : z5);
    }
}
