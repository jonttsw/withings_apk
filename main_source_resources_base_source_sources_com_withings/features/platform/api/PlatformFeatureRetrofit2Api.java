package com.withings.features.platform.api;

import com.withings.feature.platform.model.PlatformFeatureListWS;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: PlatformFeatureRetrofit2Api.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004Jb\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0004\b\u0010\u0010\u0011JJ\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\rH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/withings/features/platform/api/PlatformFeatureRetrofit2Api;", "", "Lcom/withings/feature/platform/model/PlatformFeatureListWS;", "getPlatformFeatures", "(Lqm0/d;)Ljava/lang/Object;", "", "featureId", "", "deviceId", "accountId", NavigationArguments.USER_ID, "startDate", "endDate", "", "isTutorialSeen", "Lnm0/y;", "setPlatformFeature", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lqm0/d;)Ljava/lang/Object;", "unsetPlatformFeature", "(ILjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Lqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface PlatformFeatureRetrofit2Api {
    @o("v2/feature?action=getall")
    Object getPlatformFeatures(d<? super PlatformFeatureListWS> dVar);

    @e
    @o("v2/feature?action=set")
    Object setPlatformFeature(@c("featureid") int i11, @c("deviceid") Long l5, @c("accountid") Long l6, @c("userid") Long l11, @c("startdate") Long l12, @c("enddate") Long l13, @c("tutorial") Boolean bool, d<? super y> dVar);

    @e
    @o("v2/feature?action=unset")
    Object unsetPlatformFeature(@c("featureid") int i11, @c("deviceid") Long l5, @c("accountid") Long l6, @c("userid") Long l11, @c("tutorial") Boolean bool, d<? super y> dVar);
}
