package com.withings.features.platform.sync;

import com.withings.feature.platform.model.PlatformFeatureListWS;
import com.withings.feature.platform.model.PlatformFeatureWS;
import com.withings.features.platform.api.PlatformFeatureApiMapperKt;
import com.withings.features.platform.model.AccountOwner;
import com.withings.features.platform.model.DeviceOwner;
import com.withings.features.platform.model.Owner;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.webservices.legacy.lastupdate.LastUpdateCheckerKt;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import nm0.k;
import nm0.o;
import nm0.y;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import ym0.l;
/* compiled from: SyncPlatformFeature.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020\u0013¢\u0006\u0004\b%\u0010&J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\f\u0010\nJ/\u0010\u000f\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u0013*\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/withings/features/platform/sync/SyncPlatformFeature;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lorg/joda/time/DateTime;", "getRemoteLastUpdate", "()Lorg/joda/time/DateTime;", "", "Lcom/withings/features/platform/model/PlatformFeature;", "notSyncedFeatures", "Lnm0/y;", "syncPlatformFeatures", "(Ljava/util/List;)V", "wsFeatures", "setAsSyncThenReplaceAllFeatures", "Lnm0/o;", "", "getFeaturesWithoutConflicts", "()Lnm0/o;", "Lcom/withings/features/platform/model/Owner;", "owners", "", "hasOwnerOverrideByAny", "(Lcom/withings/features/platform/model/Owner;Ljava/util/List;)Z", "needsLastUpdate", "()Z", "run", "()V", "Lqr/a;", "platformFeatureApi", "Lqr/a;", "Lcom/withings/features/platform/model/PlatformFeatureRepository;", "platformFeatureRepository", "Lcom/withings/features/platform/model/PlatformFeatureRepository;", "Lvr/c;", "featureTagsLastUpdateRepository", "Lvr/c;", "ignoreLastUpdate", "Z", "<init>", "(Lqr/a;Lcom/withings/features/platform/model/PlatformFeatureRepository;Lvr/c;Z)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SyncPlatformFeature extends BaseSyncAction {
    private final vr.c featureTagsLastUpdateRepository;
    private final boolean ignoreLastUpdate;
    private final qr.a platformFeatureApi;
    private final PlatformFeatureRepository platformFeatureRepository;

    public SyncPlatformFeature(qr.a platformFeatureApi, PlatformFeatureRepository platformFeatureRepository, vr.c featureTagsLastUpdateRepository, boolean z5) {
        u.j(platformFeatureApi, "platformFeatureApi");
        u.j(platformFeatureRepository, "platformFeatureRepository");
        u.j(featureTagsLastUpdateRepository, "featureTagsLastUpdateRepository");
        this.platformFeatureApi = platformFeatureApi;
        this.platformFeatureRepository = platformFeatureRepository;
        this.featureTagsLastUpdateRepository = featureTagsLastUpdateRepository;
        this.ignoreLastUpdate = z5;
    }

    private final o<List<PlatformFeature>, List<PlatformFeature>, Long> getFeaturesWithoutConflicts() {
        Object runBlocking$default;
        Object obj;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new SyncPlatformFeature$getFeaturesWithoutConflicts$apiResponse$1(this, null), 1, null);
        PlatformFeatureListWS platformFeatureListWS = (PlatformFeatureListWS) runBlocking$default;
        List<PlatformFeatureWS> features = platformFeatureListWS.getFeatures();
        ArrayList arrayList = new ArrayList(x.y(features, 10));
        for (PlatformFeatureWS platformFeatureWS : features) {
            arrayList.add(PlatformFeatureApiMapperKt.mapToDatabaseEntity(platformFeatureWS));
        }
        ArrayList S0 = x.S0(arrayList);
        ArrayList arrayList2 = new ArrayList(x.y(S0, 10));
        Iterator it = S0.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((PlatformFeature) it.next()).getFeatureId()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : this.platformFeatureRepository.getNotSyncedFeatures()) {
            if (arrayList2.contains(Integer.valueOf(((PlatformFeature) obj2).getFeatureId()))) {
                arrayList3.add(obj2);
            }
        }
        ArrayList S02 = x.S0(arrayList3);
        Iterator it2 = S02.iterator();
        while (it2.hasNext()) {
            PlatformFeature platformFeature = (PlatformFeature) it2.next();
            Iterator it3 = S0.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (((PlatformFeature) obj).getFeatureId() == platformFeature.getFeatureId()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            PlatformFeature platformFeature2 = (PlatformFeature) obj;
            if (platformFeature2 != null) {
                ArrayList S03 = x.S0(platformFeature2.getOwners());
                final SyncPlatformFeature$getFeaturesWithoutConflicts$1$2$1$1 syncPlatformFeature$getFeaturesWithoutConflicts$1$2$1$1 = new SyncPlatformFeature$getFeaturesWithoutConflicts$1$2$1$1(this, platformFeature);
                S03.removeIf(new Predicate() { // from class: com.withings.features.platform.sync.a
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj3) {
                        boolean featuresWithoutConflicts$lambda$23$lambda$22$lambda$19$lambda$18;
                        featuresWithoutConflicts$lambda$23$lambda$22$lambda$19$lambda$18 = SyncPlatformFeature.getFeaturesWithoutConflicts$lambda$23$lambda$22$lambda$19$lambda$18(l.this, obj3);
                        return featuresWithoutConflicts$lambda$23$lambda$22$lambda$19$lambda$18;
                    }
                });
                platformFeature2.setOwners(x.Q0(S03));
                ArrayList S04 = x.S0(platformFeature.getOwners());
                final SyncPlatformFeature$getFeaturesWithoutConflicts$1$2$2$1 syncPlatformFeature$getFeaturesWithoutConflicts$1$2$2$1 = new SyncPlatformFeature$getFeaturesWithoutConflicts$1$2$2$1(this, platformFeature2);
                S04.removeIf(new Predicate() { // from class: com.withings.features.platform.sync.b
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj3) {
                        boolean featuresWithoutConflicts$lambda$23$lambda$22$lambda$21$lambda$20;
                        featuresWithoutConflicts$lambda$23$lambda$22$lambda$21$lambda$20 = SyncPlatformFeature.getFeaturesWithoutConflicts$lambda$23$lambda$22$lambda$21$lambda$20(l.this, obj3);
                        return featuresWithoutConflicts$lambda$23$lambda$22$lambda$21$lambda$20;
                    }
                });
                platformFeature.setOwners(x.Q0(S04));
            }
        }
        final SyncPlatformFeature$getFeaturesWithoutConflicts$2 syncPlatformFeature$getFeaturesWithoutConflicts$2 = SyncPlatformFeature$getFeaturesWithoutConflicts$2.INSTANCE;
        S0.removeIf(new Predicate() { // from class: com.withings.features.platform.sync.c
            @Override // java.util.function.Predicate
            public final boolean test(Object obj3) {
                boolean featuresWithoutConflicts$lambda$24;
                featuresWithoutConflicts$lambda$24 = SyncPlatformFeature.getFeaturesWithoutConflicts$lambda$24(l.this, obj3);
                return featuresWithoutConflicts$lambda$24;
            }
        });
        final SyncPlatformFeature$getFeaturesWithoutConflicts$3 syncPlatformFeature$getFeaturesWithoutConflicts$3 = SyncPlatformFeature$getFeaturesWithoutConflicts$3.INSTANCE;
        S02.removeIf(new Predicate() { // from class: com.withings.features.platform.sync.d
            @Override // java.util.function.Predicate
            public final boolean test(Object obj3) {
                boolean featuresWithoutConflicts$lambda$25;
                featuresWithoutConflicts$lambda$25 = SyncPlatformFeature.getFeaturesWithoutConflicts$lambda$25(l.this, obj3);
                return featuresWithoutConflicts$lambda$25;
            }
        });
        return new o<>(S0, S02, platformFeatureListWS.getModified());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFeaturesWithoutConflicts$lambda$23$lambda$22$lambda$19$lambda$18(l tmp0, Object obj) {
        u.j(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFeaturesWithoutConflicts$lambda$23$lambda$22$lambda$21$lambda$20(l tmp0, Object obj) {
        u.j(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFeaturesWithoutConflicts$lambda$24(l tmp0, Object obj) {
        u.j(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getFeaturesWithoutConflicts$lambda$25(l tmp0, Object obj) {
        u.j(tmp0, "$tmp0");
        return ((Boolean) tmp0.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
        if (r4.getMillis() > 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010b, code lost:
        if (r6.getMillis() > 0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final org.joda.time.DateTime getRemoteLastUpdate() {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.features.platform.sync.SyncPlatformFeature.getRemoteLastUpdate():org.joda.time.DateTime");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r2.getModified() > r7.getModified()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
        if (r2.getModified() > r7.getModified()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasOwnerOverrideByAny(com.withings.features.platform.model.Owner r7, java.util.List<? extends com.withings.features.platform.model.Owner> r8) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.withings.features.platform.model.DeviceOwner
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L46
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        Ld:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r8.next()
            r4 = r0
            com.withings.features.platform.model.Owner r4 = (com.withings.features.platform.model.Owner) r4
            boolean r5 = r4 instanceof com.withings.features.platform.model.DeviceOwner
            if (r5 == 0) goto Ld
            com.withings.features.platform.model.DeviceOwner r4 = (com.withings.features.platform.model.DeviceOwner) r4
            java.lang.Long r4 = r4.getDeviceId()
            r5 = r7
            com.withings.features.platform.model.DeviceOwner r5 = (com.withings.features.platform.model.DeviceOwner) r5
            java.lang.Long r5 = r5.getDeviceId()
            boolean r4 = kotlin.jvm.internal.u.e(r4, r5)
            if (r4 == 0) goto Ld
            r2 = r0
        L32:
            com.withings.features.platform.model.Owner r2 = (com.withings.features.platform.model.Owner) r2
            if (r2 == 0) goto L86
            long r4 = r2.getModified()
            long r7 = r7.getModified()
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 <= 0) goto L43
            goto L44
        L43:
            r1 = r3
        L44:
            r3 = r1
            goto L86
        L46:
            boolean r0 = r7 instanceof com.withings.features.platform.model.AccountOwner
            if (r0 == 0) goto L86
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L50:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r8.next()
            r4 = r0
            com.withings.features.platform.model.Owner r4 = (com.withings.features.platform.model.Owner) r4
            boolean r5 = r4 instanceof com.withings.features.platform.model.AccountOwner
            if (r5 == 0) goto L50
            com.withings.features.platform.model.AccountOwner r4 = (com.withings.features.platform.model.AccountOwner) r4
            java.lang.Long r4 = r4.getAccountId()
            r5 = r7
            com.withings.features.platform.model.AccountOwner r5 = (com.withings.features.platform.model.AccountOwner) r5
            java.lang.Long r5 = r5.getAccountId()
            boolean r4 = kotlin.jvm.internal.u.e(r4, r5)
            if (r4 == 0) goto L50
            r2 = r0
        L75:
            com.withings.features.platform.model.Owner r2 = (com.withings.features.platform.model.Owner) r2
            if (r2 == 0) goto L86
            long r4 = r2.getModified()
            long r7 = r7.getModified()
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 <= 0) goto L43
            goto L44
        L86:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.features.platform.sync.SyncPlatformFeature.hasOwnerOverrideByAny(com.withings.features.platform.model.Owner, java.util.List):boolean");
    }

    private final void setAsSyncThenReplaceAllFeatures(List<PlatformFeature> list) {
        PlatformFeatureRepository platformFeatureRepository = this.platformFeatureRepository;
        List<PlatformFeature> list2 = list;
        for (PlatformFeature platformFeature : list2) {
            platformFeature.setSynced(true);
        }
        platformFeatureRepository.replaceAllFeatures(list2);
    }

    private final void syncPlatformFeatures(List<PlatformFeature> list) {
        for (PlatformFeature platformFeature : list) {
            for (Owner owner : platformFeature.getOwners()) {
                if (owner instanceof DeviceOwner) {
                    new SetPlatformFeature(platformFeature, ((DeviceOwner) owner).getDeviceId(), null, this.platformFeatureRepository, this.platformFeatureApi, owner.getActive(), 4, null).run();
                } else if (owner instanceof AccountOwner) {
                    new SetPlatformFeature(platformFeature, null, ((AccountOwner) owner).getAccountId(), this.platformFeatureRepository, this.platformFeatureApi, owner.getActive(), 2, null).run();
                }
            }
        }
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction
    public boolean needsLastUpdate() {
        return !this.ignoreLastUpdate;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        Object runBlocking$default;
        long j5;
        Object obj = null;
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new SyncPlatformFeature$run$localLastUpdate$1(this, null), 1, null);
        Instant instant = (Instant) runBlocking$default;
        DateTime remoteLastUpdate = getRemoteLastUpdate();
        if (!this.ignoreLastUpdate) {
            if (remoteLastUpdate != null) {
                if (instant != null) {
                    j5 = instant.getMillis();
                } else {
                    j5 = 0;
                }
                if (!LastUpdateCheckerKt.shouldMakeCallForLastUpdate(remoteLastUpdate, j5)) {
                    return;
                }
            } else {
                return;
            }
        }
        try {
            o<List<PlatformFeature>, List<PlatformFeature>, Long> featuresWithoutConflicts = getFeaturesWithoutConflicts();
            Long c11 = featuresWithoutConflicts.c();
            setAsSyncThenReplaceAllFeatures(featuresWithoutConflicts.a());
            syncPlatformFeatures(featuresWithoutConflicts.b());
            if (c11 != null) {
                BuildersKt__BuildersKt.runBlocking$default(null, new SyncPlatformFeature$run$1$1$1(this, c11.longValue(), null), 1, null);
                obj = y.f85009a;
            }
        } catch (Throwable th2) {
            obj = nm0.l.a(th2);
        }
        Throwable b10 = k.b(obj);
        if (b10 != null) {
            x70.b.t(this, b10.getMessage(), b10);
        }
    }

    public /* synthetic */ SyncPlatformFeature(qr.a aVar, PlatformFeatureRepository platformFeatureRepository, vr.c cVar, boolean z5, int i11, m mVar) {
        this(aVar, platformFeatureRepository, cVar, (i11 & 8) != 0 ? false : z5);
    }
}
