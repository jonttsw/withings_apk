package com.withings.features.platform.model;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceFeaturesLiveData.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/features/platform/model/PlatformFeature;", "feature", "Lnm0/y;", "invoke", "(Lcom/withings/features/platform/model/PlatformFeature;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DeviceFeaturesLiveData$1$1 extends w implements l<PlatformFeature, y> {
    final /* synthetic */ List<PlatformFeature> $fetchedFeatures;
    final /* synthetic */ List<Integer> $requestedFeatureIds;
    final /* synthetic */ boolean $shouldPostWhenAllFeaturesAreFetched;
    final /* synthetic */ DeviceFeaturesLiveData this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceFeaturesLiveData$1$1(List<PlatformFeature> list, boolean z5, List<Integer> list2, DeviceFeaturesLiveData deviceFeaturesLiveData) {
        super(1);
        this.$fetchedFeatures = list;
        this.$shouldPostWhenAllFeaturesAreFetched = z5;
        this.$requestedFeatureIds = list2;
        this.this$0 = deviceFeaturesLiveData;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(PlatformFeature platformFeature) {
        invoke2(platformFeature);
        return y.f85009a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(PlatformFeature platformFeature) {
        PlatformFeature platformFeature2 = null;
        if (platformFeature != null) {
            if (!PlatformFeatureKt.isDeviceEligible(platformFeature, this.this$0.getDeviceId())) {
                platformFeature = null;
            }
            if (platformFeature != null) {
                List<PlatformFeature> list = this.$fetchedFeatures;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    PlatformFeature platformFeature3 = (PlatformFeature) next;
                    if (platformFeature3 != null && platformFeature.getFeatureId() == platformFeature3.getFeatureId()) {
                        platformFeature2 = next;
                        break;
                    }
                }
                PlatformFeature platformFeature4 = platformFeature2;
                if (platformFeature4 != null) {
                    list.remove(platformFeature4);
                }
                platformFeature2 = platformFeature;
            }
        }
        this.$fetchedFeatures.add(platformFeature2);
        if (this.$shouldPostWhenAllFeaturesAreFetched) {
            if (this.$fetchedFeatures.size() >= this.$requestedFeatureIds.size()) {
                this.this$0.postValue(x.G(this.$fetchedFeatures));
                return;
            }
            return;
        }
        this.this$0.postValue(x.G(this.$fetchedFeatures));
    }
}
