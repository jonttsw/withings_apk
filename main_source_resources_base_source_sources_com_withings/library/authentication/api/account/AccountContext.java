package com.withings.library.authentication.api.account;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: AccountContext.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB\u001d\b\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018B3\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\b\u0010\tR \u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/withings/library/authentication/api/account/AccountContext;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/library/authentication/api/account/AccountContext;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/withings/library/authentication/api/account/Subscribed;", "subscribed", "Lcom/withings/library/authentication/api/account/Subscribed;", "getSubscribed", "()Lcom/withings/library/authentication/api/account/Subscribed;", "getSubscribed$annotations", "()V", "Lcom/withings/library/authentication/api/account/SharedUnit;", "sharedUnit", "Lcom/withings/library/authentication/api/account/SharedUnit;", "getSharedUnit", "()Lcom/withings/library/authentication/api/account/SharedUnit;", "getSharedUnit$annotations", "<init>", "(Lcom/withings/library/authentication/api/account/Subscribed;Lcom/withings/library/authentication/api/account/SharedUnit;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/withings/library/authentication/api/account/Subscribed;Lcom/withings/library/authentication/api/account/SharedUnit;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Authentication_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class AccountContext {
    public static final Companion Companion = new Companion(null);
    private final SharedUnit sharedUnit;
    private final Subscribed subscribed;

    /* compiled from: AccountContext.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/account/AccountContext$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/account/AccountContext;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<AccountContext> serializer() {
            return AccountContext$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AccountContext() {
        this((Subscribed) null, (SharedUnit) null, 3, (m) null);
    }

    public static final /* synthetic */ void write$Self(AccountContext accountContext, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !u.e(accountContext.subscribed, new Subscribed((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 63, (m) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, Subscribed$$serializer.INSTANCE, accountContext.subscribed);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !u.e(accountContext.sharedUnit, new SharedUnit((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15, (m) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, SharedUnit$$serializer.INSTANCE, accountContext.sharedUnit);
        }
    }

    public final SharedUnit getSharedUnit() {
        return this.sharedUnit;
    }

    public final Subscribed getSubscribed() {
        return this.subscribed;
    }

    public /* synthetic */ AccountContext(int i11, Subscribed subscribed, SharedUnit sharedUnit, SerializationConstructorMarker serializationConstructorMarker) {
        this.subscribed = (i11 & 1) == 0 ? new Subscribed((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 63, (m) null) : subscribed;
        if ((i11 & 2) == 0) {
            this.sharedUnit = new SharedUnit((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15, (m) null);
        } else {
            this.sharedUnit = sharedUnit;
        }
    }

    public AccountContext(Subscribed subscribed, SharedUnit sharedUnit) {
        u.j(subscribed, "subscribed");
        u.j(sharedUnit, "sharedUnit");
        this.subscribed = subscribed;
        this.sharedUnit = sharedUnit;
    }

    public /* synthetic */ AccountContext(Subscribed subscribed, SharedUnit sharedUnit, int i11, m mVar) {
        this((i11 & 1) != 0 ? new Subscribed((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 63, (m) null) : subscribed, (i11 & 2) != 0 ? new SharedUnit((Integer) null, (Integer) null, (Integer) null, (Integer) null, 15, (m) null) : sharedUnit);
    }

    public static /* synthetic */ void getSharedUnit$annotations() {
    }

    public static /* synthetic */ void getSubscribed$annotations() {
    }
}
