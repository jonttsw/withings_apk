package com.withings.features.platform.model;

import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
/* compiled from: PlatformFeatureDao.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\nH'¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0010\u0010\tJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r2\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n2\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0003H'¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b \u0010\u0007¨\u0006!À\u0006\u0003"}, d2 = {"Lcom/withings/features/platform/model/PlatformFeatureDao;", "", "", "Lcom/withings/features/platform/model/PlatformFeature;", "features", "Lnm0/y;", "insert", "(Ljava/util/List;)V", "getAllPlatformFeatures", "()Ljava/util/List;", "Landroidx/lifecycle/LiveData;", "getAllPlatformFeaturesLiveData", "()Landroidx/lifecycle/LiveData;", "Lkotlinx/coroutines/flow/Flow;", "getAllPlatformFeaturesFlow", "()Lkotlinx/coroutines/flow/Flow;", "getNotSyncedFeatures", "", "featureId", "getFeatureById", "(I)Lcom/withings/features/platform/model/PlatformFeature;", "getFeature", "getFeatureAsFlow", "(I)Lkotlinx/coroutines/flow/Flow;", "getFeatureLiveData", "(I)Landroidx/lifecycle/LiveData;", CervicalMucusRecord.Appearance.CLEAR, "()V", "platformFeature", "updateFeature", "(Lcom/withings/features/platform/model/PlatformFeature;)V", "platformFeatures", "updateFeatures", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface PlatformFeatureDao {
    void clear();

    List<PlatformFeature> getAllPlatformFeatures();

    Flow<List<PlatformFeature>> getAllPlatformFeaturesFlow();

    LiveData<List<PlatformFeature>> getAllPlatformFeaturesLiveData();

    PlatformFeature getFeature(int i11);

    Flow<PlatformFeature> getFeatureAsFlow(int i11);

    PlatformFeature getFeatureById(int i11);

    LiveData<PlatformFeature> getFeatureLiveData(int i11);

    List<PlatformFeature> getNotSyncedFeatures();

    void insert(List<PlatformFeature> list);

    void updateFeature(PlatformFeature platformFeature);

    void updateFeatures(List<PlatformFeature> list);
}
