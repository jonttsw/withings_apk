package com.withings.features.platform.model;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: RoomPlatformFeatureRepository.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\"\u001b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"lastUpdate", "", "", "Lcom/withings/features/platform/model/Owner;", "getLastUpdate", "(Ljava/util/List;)J", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RoomPlatformFeatureRepositoryKt {
    public static final long getLastUpdate(List<? extends Owner> list) {
        Long l5;
        u.j(list, "<this>");
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            l5 = null;
        } else {
            Long valueOf = Long.valueOf(((Owner) it.next()).getModified());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((Owner) it.next()).getModified());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l5 = valueOf;
        }
        if (l5 != null) {
            return l5.longValue() * 1000;
        }
        return 0L;
    }
}
