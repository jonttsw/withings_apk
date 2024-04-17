package com.withings.library.ecg.leads;

import com.withings.library.ecg.p003native.EcgNative;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NativeEcgLeadsProvider.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/withings/library/ecg/leads/NativeEcgLeadsProvider;", "", "()V", "computeLeadsFromdIIdIII", "Lcom/withings/library/ecg/leads/ComputeResult;", "frequency", "", "gain", "leadDII", "", "leadDIII", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NativeEcgLeadsProvider {
    public final ComputeResult computeLeadsFromdIIdIII(int i11, int i12, short[] leadDII, short[] leadDIII) {
        u.j(leadDII, "leadDII");
        u.j(leadDIII, "leadDIII");
        return EcgNative.INSTANCE.computeLeadsFromdIIdIII(i11, i12, leadDII, leadDIII);
    }
}
