package com.withings.library.healthscore.utils.ktx;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import pm0.a;
/* compiled from: ListExtentions.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0004\n\u0002\u0010 \n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004¨\u0006\u0005"}, d2 = {"median", "", "X", "", "", "HealthScore_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListExtentionsKt {
    public static final <X extends Number> double median(List<? extends X> list) {
        u.j(list, "<this>");
        List D0 = x.D0(list, new Comparator() { // from class: com.withings.library.healthscore.utils.ktx.ListExtentionsKt$median$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.b(Double.valueOf(((Number) t11).doubleValue()), Double.valueOf(((Number) t12).doubleValue()));
            }
        });
        int size = D0.size();
        if (D0.isEmpty()) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        if (D0.size() % 2 == 0) {
            int i11 = size / 2;
            return (((Number) D0.get(i11 - 1)).doubleValue() + ((Number) D0.get(i11)).doubleValue()) / 2;
        }
        return ((Number) D0.get(size / 2)).doubleValue();
    }
}
