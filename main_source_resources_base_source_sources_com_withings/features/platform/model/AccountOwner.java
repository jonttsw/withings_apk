package com.withings.features.platform.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
/* compiled from: PlatformFeature.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\b\u0010\u0014\u001a\u00020\u0015H\u0016R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/withings/features/platform/model/AccountOwner;", "Lcom/withings/features/platform/model/Owner;", "accountId", "", "active", "", "activable", "write", "modified", "startDate", "endDate", "frequency", "", "isTutorialSeen", "(Ljava/lang/Long;ZZZJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Z)V", "getAccountId", "()Ljava/lang/Long;", "setAccountId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "toString", "", "Companion", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountOwner extends Owner {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_ACCOUNT_ID = "accountid";
    @SerializedName("accountid")
    private Long accountId;

    /* compiled from: PlatformFeature.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/features/platform/model/AccountOwner$Companion;", "", "()V", "KEY_ACCOUNT_ID", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public AccountOwner() {
        this(null, false, false, false, 0L, null, null, null, false, 511, null);
    }

    public final Long getAccountId() {
        return this.accountId;
    }

    public final void setAccountId(Long l5) {
        this.accountId = l5;
    }

    @Override // com.withings.features.platform.model.Owner
    public String toString() {
        Long l5 = this.accountId;
        String owner = super.toString();
        return "AccountOwner accountId " + l5 + owner;
    }

    public /* synthetic */ AccountOwner(Long l5, boolean z5, boolean z11, boolean z12, long j5, Long l6, Long l11, Integer num, boolean z13, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : l5, (i11 & 2) != 0 ? false : z5, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? 0L : j5, (i11 & 32) != 0 ? null : l6, (i11 & 64) != 0 ? null : l11, (i11 & 128) == 0 ? num : null, (i11 & 256) == 0 ? z13 : false);
    }

    public AccountOwner(Long l5, boolean z5, boolean z11, boolean z12, long j5, Long l6, Long l11, Integer num, boolean z13) {
        super(z5, z11, z12, j5, l6, l11, num, z13);
        this.accountId = l5;
    }
}
