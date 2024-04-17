package com.withings.library.authentication.api.account.authentication;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: Authentication.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00072\u00020\u0001:\u0003\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/api/account/authentication/Authentication;", "", "()V", "id", "", "getId", "()J", "Companion", "PhoneAuthentication", "UnknownAuthentication", "Lcom/withings/library/authentication/api/account/authentication/Authentication$PhoneAuthentication;", "Lcom/withings/library/authentication/api/account/authentication/Authentication$UnknownAuthentication;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable(with = AuthenticationDeserializer.class)
/* loaded from: classes4.dex */
public abstract class Authentication {
    public static final Companion Companion = new Companion(null);

    /* compiled from: Authentication.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/account/authentication/Authentication$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/account/authentication/Authentication;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<Authentication> serializer() {
            return AuthenticationDeserializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* compiled from: Authentication.kt */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b#\u0010$B/\b\u0017\u0012\u0006\u0010%\u001a\u00020\u0015\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0010\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\fR \u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u000f¨\u0006+"}, d2 = {"Lcom/withings/library/authentication/api/account/authentication/Authentication$PhoneAuthentication;", "Lcom/withings/library/authentication/api/account/authentication/Authentication;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/library/authentication/api/account/authentication/Authentication$PhoneAuthentication;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()J", "", "component2", "()Ljava/lang/String;", "id", "phoneNumber", "copy", "(JLjava/lang/String;)Lcom/withings/library/authentication/api/account/authentication/Authentication$PhoneAuthentication;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "Ljava/lang/String;", "getPhoneNumber", "getPhoneNumber$annotations", "()V", "<init>", "(JLjava/lang/String;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Authentication_release"}, k = 1, mv = {1, 9, 0})
    @Serializable
    /* loaded from: classes4.dex */
    public static final class PhoneAuthentication extends Authentication {
        public static final Companion Companion = new Companion(null);

        /* renamed from: id  reason: collision with root package name */
        private final long f40629id;
        private final String phoneNumber;

        /* compiled from: Authentication.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/account/authentication/Authentication$PhoneAuthentication$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/account/authentication/Authentication$PhoneAuthentication;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(m mVar) {
                this();
            }

            public final KSerializer<PhoneAuthentication> serializer() {
                return Authentication$PhoneAuthentication$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PhoneAuthentication(int i11, long j5, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (3 != (i11 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i11, 3, Authentication$PhoneAuthentication$$serializer.INSTANCE.getDescriptor());
            }
            this.f40629id = j5;
            this.phoneNumber = str;
        }

        public static /* synthetic */ PhoneAuthentication copy$default(PhoneAuthentication phoneAuthentication, long j5, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j5 = phoneAuthentication.f40629id;
            }
            if ((i11 & 2) != 0) {
                str = phoneAuthentication.phoneNumber;
            }
            return phoneAuthentication.copy(j5, str);
        }

        public static final /* synthetic */ void write$Self(PhoneAuthentication phoneAuthentication, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, phoneAuthentication.getId());
            compositeEncoder.encodeStringElement(serialDescriptor, 1, phoneAuthentication.phoneNumber);
        }

        public final long component1() {
            return this.f40629id;
        }

        public final String component2() {
            return this.phoneNumber;
        }

        public final PhoneAuthentication copy(long j5, String phoneNumber) {
            u.j(phoneNumber, "phoneNumber");
            return new PhoneAuthentication(j5, phoneNumber);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneAuthentication)) {
                return false;
            }
            PhoneAuthentication phoneAuthentication = (PhoneAuthentication) obj;
            if (this.f40629id == phoneAuthentication.f40629id && u.e(this.phoneNumber, phoneAuthentication.phoneNumber)) {
                return true;
            }
            return false;
        }

        @Override // com.withings.library.authentication.api.account.authentication.Authentication
        public long getId() {
            return this.f40629id;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public int hashCode() {
            return this.phoneNumber.hashCode() + (Long.hashCode(this.f40629id) * 31);
        }

        public String toString() {
            long j5 = this.f40629id;
            String str = this.phoneNumber;
            return "PhoneAuthentication(id=" + j5 + ", phoneNumber=" + str + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhoneAuthentication(long j5, String phoneNumber) {
            super(null);
            u.j(phoneNumber, "phoneNumber");
            this.f40629id = j5;
            this.phoneNumber = phoneNumber;
        }

        public static /* synthetic */ void getPhoneNumber$annotations() {
        }
    }

    /* compiled from: Authentication.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015B-\b\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/withings/library/authentication/api/account/authentication/Authentication$UnknownAuthentication;", "Lcom/withings/library/authentication/api/account/authentication/Authentication;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/library/authentication/api/account/authentication/Authentication$UnknownAuthentication;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "id", "J", "getId", "()J", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(JLjava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IJLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Authentication_release"}, k = 1, mv = {1, 9, 0})
    @Serializable
    /* loaded from: classes4.dex */
    public static final class UnknownAuthentication extends Authentication {
        public static final Companion Companion = new Companion(null);

        /* renamed from: id  reason: collision with root package name */
        private final long f40630id;
        private final String type;

        /* compiled from: Authentication.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/account/authentication/Authentication$UnknownAuthentication$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/account/authentication/Authentication$UnknownAuthentication;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(m mVar) {
                this();
            }

            public final KSerializer<UnknownAuthentication> serializer() {
                return Authentication$UnknownAuthentication$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ UnknownAuthentication(int i11, long j5, String str, SerializationConstructorMarker serializationConstructorMarker) {
            super(null);
            if (3 != (i11 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i11, 3, Authentication$UnknownAuthentication$$serializer.INSTANCE.getDescriptor());
            }
            this.f40630id = j5;
            this.type = str;
        }

        public static final /* synthetic */ void write$Self(UnknownAuthentication unknownAuthentication, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, unknownAuthentication.getId());
            compositeEncoder.encodeStringElement(serialDescriptor, 1, unknownAuthentication.type);
        }

        @Override // com.withings.library.authentication.api.account.authentication.Authentication
        public long getId() {
            return this.f40630id;
        }

        public final String getType() {
            return this.type;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnknownAuthentication(long j5, String type) {
            super(null);
            u.j(type, "type");
            this.f40630id = j5;
            this.type = type;
        }
    }

    public /* synthetic */ Authentication(m mVar) {
        this();
    }

    public abstract long getId();

    private Authentication() {
    }
}
