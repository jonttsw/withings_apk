package com.withings.features.platform.api;

import com.withings.feature.platform.model.OwnerWS;
import com.withings.feature.platform.model.PlatformFeatureWS;
import com.withings.features.platform.model.AccountOwner;
import com.withings.features.platform.model.DeviceOwner;
import com.withings.features.platform.model.Owner;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.UserOwner;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: PlatformFeatureApiMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, d2 = {"mapToDatabaseEntity", "Lcom/withings/features/platform/model/Owner;", "Lcom/withings/feature/platform/model/OwnerWS;", "Lcom/withings/features/platform/model/PlatformFeature;", "Lcom/withings/feature/platform/model/PlatformFeatureWS;", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlatformFeatureApiMapperKt {
    public static final PlatformFeature mapToDatabaseEntity(PlatformFeatureWS platformFeatureWS) {
        u.j(platformFeatureWS, "<this>");
        int featureId = platformFeatureWS.getFeatureId();
        String name = platformFeatureWS.getName();
        boolean synced = platformFeatureWS.getSynced();
        List<OwnerWS> owners = platformFeatureWS.getOwners();
        ArrayList arrayList = new ArrayList(x.y(owners, 10));
        for (OwnerWS ownerWS : owners) {
            arrayList.add(mapToDatabaseEntity(ownerWS));
        }
        return new PlatformFeature(featureId, name, arrayList, synced);
    }

    public static final Owner mapToDatabaseEntity(OwnerWS ownerWS) {
        u.j(ownerWS, "<this>");
        if (ownerWS instanceof OwnerWS.DeviceOwnerWS) {
            return new DeviceOwner(((OwnerWS.DeviceOwnerWS) ownerWS).getDeviceId(), ownerWS.getActive(), ownerWS.getActivable(), ownerWS.getWrite(), ownerWS.getModified(), ownerWS.getStartDate(), ownerWS.getEndDate(), ownerWS.getFrequency(), ownerWS.isTutorialSeen());
        }
        if (ownerWS instanceof OwnerWS.UserOwnerWS) {
            OwnerWS.UserOwnerWS userOwnerWS = (OwnerWS.UserOwnerWS) ownerWS;
            return new UserOwner(userOwnerWS.getUserId(), userOwnerWS.getDeviceId(), ownerWS.getActive(), ownerWS.getActivable(), ownerWS.getWrite(), ownerWS.getModified(), ownerWS.getStartDate(), ownerWS.getEndDate(), ownerWS.getFrequency(), ownerWS.isTutorialSeen());
        } else if (ownerWS instanceof OwnerWS.AccountOwnerWS) {
            return new AccountOwner(((OwnerWS.AccountOwnerWS) ownerWS).getAccountId(), ownerWS.getActive(), ownerWS.getActivable(), ownerWS.getWrite(), ownerWS.getModified(), ownerWS.getStartDate(), ownerWS.getEndDate(), ownerWS.getFrequency(), ownerWS.isTutorialSeen());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
