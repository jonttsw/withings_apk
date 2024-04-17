package com.withings.library.authentication.api.account;

import bn.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: AccountContextResponse.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u001f\u0010 B-\b\u0017\u0012\u0006\u0010!\u001a\u00020\u0014\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b\u001f\u0010$J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\r¨\u0006'"}, d2 = {"Lcom/withings/library/authentication/api/account/AccountContextResponse;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/library/authentication/api/account/AccountContextResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "Lcom/withings/library/authentication/api/account/AccountResponse;", "component1", "()Ljava/util/List;", "account", "copy", "(Ljava/util/List;)Lcom/withings/library/authentication/api/account/AccountContextResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAccount", "getAccount$annotations", "()V", "<init>", "(Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Authentication_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class AccountContextResponse {
    private final List<AccountResponse> account;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(AccountResponse$$serializer.INSTANCE)};

    /* compiled from: AccountContextResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/account/AccountContextResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/account/AccountContextResponse;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<AccountContextResponse> serializer() {
            return AccountContextResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AccountContextResponse(int i11, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i11 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 1, AccountContextResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.account = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountContextResponse copy$default(AccountContextResponse accountContextResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = accountContextResponse.account;
        }
        return accountContextResponse.copy(list);
    }

    public final List<AccountResponse> component1() {
        return this.account;
    }

    public final AccountContextResponse copy(List<AccountResponse> account) {
        u.j(account, "account");
        return new AccountContextResponse(account);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AccountContextResponse) && u.e(this.account, ((AccountContextResponse) obj).account)) {
            return true;
        }
        return false;
    }

    public final List<AccountResponse> getAccount() {
        return this.account;
    }

    public int hashCode() {
        return this.account.hashCode();
    }

    public String toString() {
        return d.b("AccountContextResponse(account=", this.account, ")");
    }

    public AccountContextResponse(List<AccountResponse> account) {
        u.j(account, "account");
        this.account = account;
    }

    public static /* synthetic */ void getAccount$annotations() {
    }
}
