package com.withings.library.ecg.udi;

import com.withings.library.ecg.p003native.EcgNative;
import kotlin.Metadata;
/* compiled from: NativeUdiGetter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/library/ecg/udi/NativeUdiGetter;", "", "()V", "getUdi", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NativeUdiGetter {
    public final String getUdi() {
        return EcgNative.INSTANCE.getUdiNative();
    }
}
