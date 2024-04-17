package com.withings.features.platform.model;

import androidx.lifecycle.j0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: DeviceFeaturesLiveData.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/withings/features/platform/model/DeviceFeaturesLiveData;", "Landroidx/lifecycle/j0;", "", "Lcom/withings/features/platform/model/PlatformFeature;", "", "deviceId", "J", "getDeviceId", "()J", "", "requestedFeatureIds", "Lcom/withings/features/platform/model/PlatformFeatureRepository;", "featureRepository", "", "shouldPostWhenAllFeaturesAreFetched", "<init>", "(JLjava/util/List;Lcom/withings/features/platform/model/PlatformFeatureRepository;Z)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DeviceFeaturesLiveData extends j0<List<? extends PlatformFeature>> {
    private final long deviceId;

    public /* synthetic */ DeviceFeaturesLiveData(long j5, List list, PlatformFeatureRepository platformFeatureRepository, boolean z5, int i11, m mVar) {
        this(j5, list, (i11 & 4) != 0 ? RoomPlatformFeatureRepository.Companion.get() : platformFeatureRepository, (i11 & 8) != 0 ? false : z5);
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public DeviceFeaturesLiveData(long j5, List<Integer> requestedFeatureIds, PlatformFeatureRepository featureRepository, boolean z5) {
        u.j(requestedFeatureIds, "requestedFeatureIds");
        u.j(featureRepository, "featureRepository");
        this.deviceId = j5;
        ArrayList arrayList = new ArrayList();
        for (Number number : requestedFeatureIds) {
            addSource(featureRepository.getFeatureLiveData(number.intValue()), new DeviceFeaturesLiveData$sam$androidx_lifecycle_Observer$0(new DeviceFeaturesLiveData$1$1(arrayList, z5, requestedFeatureIds, this)));
        }
    }
}
