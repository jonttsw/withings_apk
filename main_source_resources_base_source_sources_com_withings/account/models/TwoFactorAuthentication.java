package com.withings.account.models;

import com.google.android.gms.internal.mlkit_common.a;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.withings.account.network.ws.RetrofitAccountRemoteRepository;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: TwoFactorAuthentication.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/withings/account/models/TwoFactorAuthentication;", "", "()V", "id", "", "getId", "()J", "Call", "Deserializer", DeviceInfo.STR_TYPE_PHONE, "Response", "Totp", DeviceInfo.STR_TYPE_UNKNOWN, "Whatsapp", "Lcom/withings/account/models/TwoFactorAuthentication$Call;", "Lcom/withings/account/models/TwoFactorAuthentication$Phone;", "Lcom/withings/account/models/TwoFactorAuthentication$Totp;", "Lcom/withings/account/models/TwoFactorAuthentication$Unknown;", "Lcom/withings/account/models/TwoFactorAuthentication$Whatsapp;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TwoFactorAuthentication {
    public static final int $stable = 0;

    /* compiled from: TwoFactorAuthentication.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/withings/account/models/TwoFactorAuthentication$Call;", "Lcom/withings/account/models/TwoFactorAuthentication;", "id", "", "phoneNumber", "", "creationDate", "Lorg/joda/time/DateTime;", "modifiedDate", "(JLjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getCreationDate", "()Lorg/joda/time/DateTime;", "getId", "()J", "getModifiedDate", "getPhoneNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Call extends TwoFactorAuthentication {
        public static final int $stable = 8;
        @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
        private final DateTime creationDate;

        /* renamed from: id  reason: collision with root package name */
        private final long f30978id;
        @SerializedName("modified")
        private final DateTime modifiedDate;
        @SerializedName("phone_number")
        private final String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Call(long j5, String phoneNumber, DateTime creationDate, DateTime modifiedDate) {
            super(null);
            u.j(phoneNumber, "phoneNumber");
            u.j(creationDate, "creationDate");
            u.j(modifiedDate, "modifiedDate");
            this.f30978id = j5;
            this.phoneNumber = phoneNumber;
            this.creationDate = creationDate;
            this.modifiedDate = modifiedDate;
        }

        public static /* synthetic */ Call copy$default(Call call, long j5, String str, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j5 = call.f30978id;
            }
            long j11 = j5;
            if ((i11 & 2) != 0) {
                str = call.phoneNumber;
            }
            String str2 = str;
            if ((i11 & 4) != 0) {
                dateTime = call.creationDate;
            }
            DateTime dateTime3 = dateTime;
            if ((i11 & 8) != 0) {
                dateTime2 = call.modifiedDate;
            }
            return call.copy(j11, str2, dateTime3, dateTime2);
        }

        public final long component1() {
            return this.f30978id;
        }

        public final String component2() {
            return this.phoneNumber;
        }

        public final DateTime component3() {
            return this.creationDate;
        }

        public final DateTime component4() {
            return this.modifiedDate;
        }

        public final Call copy(long j5, String phoneNumber, DateTime creationDate, DateTime modifiedDate) {
            u.j(phoneNumber, "phoneNumber");
            u.j(creationDate, "creationDate");
            u.j(modifiedDate, "modifiedDate");
            return new Call(j5, phoneNumber, creationDate, modifiedDate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Call)) {
                return false;
            }
            Call call = (Call) obj;
            if (this.f30978id == call.f30978id && u.e(this.phoneNumber, call.phoneNumber) && u.e(this.creationDate, call.creationDate) && u.e(this.modifiedDate, call.modifiedDate)) {
                return true;
            }
            return false;
        }

        public final DateTime getCreationDate() {
            return this.creationDate;
        }

        @Override // com.withings.account.models.TwoFactorAuthentication
        public long getId() {
            return this.f30978id;
        }

        public final DateTime getModifiedDate() {
            return this.modifiedDate;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public int hashCode() {
            return this.modifiedDate.hashCode() + a.b(this.creationDate, d.c(this.phoneNumber, Long.hashCode(this.f30978id) * 31, 31), 31);
        }

        public String toString() {
            long j5 = this.f30978id;
            String str = this.phoneNumber;
            DateTime dateTime = this.creationDate;
            DateTime dateTime2 = this.modifiedDate;
            return "Call(id=" + j5 + ", phoneNumber=" + str + ", creationDate=" + dateTime + ", modifiedDate=" + dateTime2 + ")";
        }
    }

    /* compiled from: TwoFactorAuthentication.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/withings/account/models/TwoFactorAuthentication$Deserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/withings/account/models/TwoFactorAuthentication;", "()V", "deserialize", LearnMoreManager.KEY_LEARN_MORE_JSON, "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Lcom/google/gson/JsonDeserializationContext;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Deserializer implements JsonDeserializer<TwoFactorAuthentication> {
        public static final int $stable = 0;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public TwoFactorAuthentication deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
            u.j(json, "json");
            u.j(typeOfT, "typeOfT");
            u.j(context, "context");
            String asString = json.getAsJsonObject().get("type").getAsString();
            if (asString != null) {
                switch (asString.hashCode()) {
                    case 3045982:
                        if (asString.equals(RetrofitAccountRemoteRepository.CHANNEL_CALL)) {
                            Object deserialize = context.deserialize(json, Call.class);
                            u.i(deserialize, "deserialize(...)");
                            return (TwoFactorAuthentication) deserialize;
                        }
                        break;
                    case 3566135:
                        if (asString.equals(ConstantsWs.AUTHENTICATION_TYPE_TOTP)) {
                            Object deserialize2 = context.deserialize(json, Totp.class);
                            u.i(deserialize2, "deserialize(...)");
                            return (TwoFactorAuthentication) deserialize2;
                        }
                        break;
                    case 106642798:
                        if (asString.equals("phone")) {
                            Object deserialize3 = context.deserialize(json, Phone.class);
                            u.i(deserialize3, "deserialize(...)");
                            return (TwoFactorAuthentication) deserialize3;
                        }
                        break;
                    case 1934780818:
                        if (asString.equals(RetrofitAccountRemoteRepository.CHANNEL_WHATSAPP)) {
                            Object deserialize4 = context.deserialize(json, Whatsapp.class);
                            u.i(deserialize4, "deserialize(...)");
                            return (TwoFactorAuthentication) deserialize4;
                        }
                        break;
                }
            }
            Object deserialize5 = context.deserialize(json, Unknown.class);
            u.i(deserialize5, "deserialize(...)");
            return (TwoFactorAuthentication) deserialize5;
        }
    }

    /* compiled from: TwoFactorAuthentication.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/withings/account/models/TwoFactorAuthentication$Phone;", "Lcom/withings/account/models/TwoFactorAuthentication;", "id", "", "phoneNumber", "", "creationDate", "Lorg/joda/time/DateTime;", "modifiedDate", "(JLjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getCreationDate", "()Lorg/joda/time/DateTime;", "getId", "()J", "getModifiedDate", "getPhoneNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Phone extends TwoFactorAuthentication {
        public static final int $stable = 8;
        @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
        private final DateTime creationDate;

        /* renamed from: id  reason: collision with root package name */
        private final long f30979id;
        @SerializedName("modified")
        private final DateTime modifiedDate;
        @SerializedName("phone_number")
        private final String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Phone(long j5, String phoneNumber, DateTime creationDate, DateTime modifiedDate) {
            super(null);
            u.j(phoneNumber, "phoneNumber");
            u.j(creationDate, "creationDate");
            u.j(modifiedDate, "modifiedDate");
            this.f30979id = j5;
            this.phoneNumber = phoneNumber;
            this.creationDate = creationDate;
            this.modifiedDate = modifiedDate;
        }

        public static /* synthetic */ Phone copy$default(Phone phone, long j5, String str, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j5 = phone.f30979id;
            }
            long j11 = j5;
            if ((i11 & 2) != 0) {
                str = phone.phoneNumber;
            }
            String str2 = str;
            if ((i11 & 4) != 0) {
                dateTime = phone.creationDate;
            }
            DateTime dateTime3 = dateTime;
            if ((i11 & 8) != 0) {
                dateTime2 = phone.modifiedDate;
            }
            return phone.copy(j11, str2, dateTime3, dateTime2);
        }

        public final long component1() {
            return this.f30979id;
        }

        public final String component2() {
            return this.phoneNumber;
        }

        public final DateTime component3() {
            return this.creationDate;
        }

        public final DateTime component4() {
            return this.modifiedDate;
        }

        public final Phone copy(long j5, String phoneNumber, DateTime creationDate, DateTime modifiedDate) {
            u.j(phoneNumber, "phoneNumber");
            u.j(creationDate, "creationDate");
            u.j(modifiedDate, "modifiedDate");
            return new Phone(j5, phoneNumber, creationDate, modifiedDate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) obj;
            if (this.f30979id == phone.f30979id && u.e(this.phoneNumber, phone.phoneNumber) && u.e(this.creationDate, phone.creationDate) && u.e(this.modifiedDate, phone.modifiedDate)) {
                return true;
            }
            return false;
        }

        public final DateTime getCreationDate() {
            return this.creationDate;
        }

        @Override // com.withings.account.models.TwoFactorAuthentication
        public long getId() {
            return this.f30979id;
        }

        public final DateTime getModifiedDate() {
            return this.modifiedDate;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public int hashCode() {
            return this.modifiedDate.hashCode() + a.b(this.creationDate, d.c(this.phoneNumber, Long.hashCode(this.f30979id) * 31, 31), 31);
        }

        public String toString() {
            long j5 = this.f30979id;
            String str = this.phoneNumber;
            DateTime dateTime = this.creationDate;
            DateTime dateTime2 = this.modifiedDate;
            return "Phone(id=" + j5 + ", phoneNumber=" + str + ", creationDate=" + dateTime + ", modifiedDate=" + dateTime2 + ")";
        }
    }

    /* compiled from: TwoFactorAuthentication.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/account/models/TwoFactorAuthentication$Response;", "", "authentications", "", "Lcom/withings/account/models/TwoFactorAuthentication;", "(Ljava/util/List;)V", "getAuthentications", "()Ljava/util/List;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Response {
        public static final int $stable = 8;
        private final List<TwoFactorAuthentication> authentications;

        /* JADX WARN: Multi-variable type inference failed */
        public Response(List<? extends TwoFactorAuthentication> authentications) {
            u.j(authentications, "authentications");
            this.authentications = authentications;
        }

        public final List<TwoFactorAuthentication> getAuthentications() {
            return this.authentications;
        }
    }

    /* compiled from: TwoFactorAuthentication.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/withings/account/models/TwoFactorAuthentication$Totp;", "Lcom/withings/account/models/TwoFactorAuthentication;", "id", "", "creationDate", "Lorg/joda/time/DateTime;", "modifiedDate", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getCreationDate", "()Lorg/joda/time/DateTime;", "getId", "()J", "getModifiedDate", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Totp extends TwoFactorAuthentication {
        public static final int $stable = 8;
        @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
        private final DateTime creationDate;

        /* renamed from: id  reason: collision with root package name */
        private final long f30980id;
        @SerializedName("modified")
        private final DateTime modifiedDate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Totp(long j5, DateTime creationDate, DateTime modifiedDate) {
            super(null);
            u.j(creationDate, "creationDate");
            u.j(modifiedDate, "modifiedDate");
            this.f30980id = j5;
            this.creationDate = creationDate;
            this.modifiedDate = modifiedDate;
        }

        public static /* synthetic */ Totp copy$default(Totp totp, long j5, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j5 = totp.f30980id;
            }
            if ((i11 & 2) != 0) {
                dateTime = totp.creationDate;
            }
            if ((i11 & 4) != 0) {
                dateTime2 = totp.modifiedDate;
            }
            return totp.copy(j5, dateTime, dateTime2);
        }

        public final long component1() {
            return this.f30980id;
        }

        public final DateTime component2() {
            return this.creationDate;
        }

        public final DateTime component3() {
            return this.modifiedDate;
        }

        public final Totp copy(long j5, DateTime creationDate, DateTime modifiedDate) {
            u.j(creationDate, "creationDate");
            u.j(modifiedDate, "modifiedDate");
            return new Totp(j5, creationDate, modifiedDate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Totp)) {
                return false;
            }
            Totp totp = (Totp) obj;
            if (this.f30980id == totp.f30980id && u.e(this.creationDate, totp.creationDate) && u.e(this.modifiedDate, totp.modifiedDate)) {
                return true;
            }
            return false;
        }

        public final DateTime getCreationDate() {
            return this.creationDate;
        }

        @Override // com.withings.account.models.TwoFactorAuthentication
        public long getId() {
            return this.f30980id;
        }

        public final DateTime getModifiedDate() {
            return this.modifiedDate;
        }

        public int hashCode() {
            return this.modifiedDate.hashCode() + a.b(this.creationDate, Long.hashCode(this.f30980id) * 31, 31);
        }

        public String toString() {
            long j5 = this.f30980id;
            DateTime dateTime = this.creationDate;
            DateTime dateTime2 = this.modifiedDate;
            return "Totp(id=" + j5 + ", creationDate=" + dateTime + ", modifiedDate=" + dateTime2 + ")";
        }
    }

    /* compiled from: TwoFactorAuthentication.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/account/models/TwoFactorAuthentication$Unknown;", "Lcom/withings/account/models/TwoFactorAuthentication;", "id", "", "type", "", "(JLjava/lang/String;)V", "getId", "()J", "getType", "()Ljava/lang/String;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Unknown extends TwoFactorAuthentication {
        public static final int $stable = 0;

        /* renamed from: id  reason: collision with root package name */
        private final long f30981id;
        private final String type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(long j5, String type) {
            super(null);
            u.j(type, "type");
            this.f30981id = j5;
            this.type = type;
        }

        @Override // com.withings.account.models.TwoFactorAuthentication
        public long getId() {
            return this.f30981id;
        }

        public final String getType() {
            return this.type;
        }
    }

    /* compiled from: TwoFactorAuthentication.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/withings/account/models/TwoFactorAuthentication$Whatsapp;", "Lcom/withings/account/models/TwoFactorAuthentication;", "id", "", "phoneNumber", "", "creationDate", "Lorg/joda/time/DateTime;", "modifiedDate", "(JLjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getCreationDate", "()Lorg/joda/time/DateTime;", "getId", "()J", "getModifiedDate", "getPhoneNumber", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Whatsapp extends TwoFactorAuthentication {
        public static final int $stable = 8;
        @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
        private final DateTime creationDate;

        /* renamed from: id  reason: collision with root package name */
        private final long f30982id;
        @SerializedName("modified")
        private final DateTime modifiedDate;
        @SerializedName("phone_number")
        private final String phoneNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Whatsapp(long j5, String phoneNumber, DateTime creationDate, DateTime modifiedDate) {
            super(null);
            u.j(phoneNumber, "phoneNumber");
            u.j(creationDate, "creationDate");
            u.j(modifiedDate, "modifiedDate");
            this.f30982id = j5;
            this.phoneNumber = phoneNumber;
            this.creationDate = creationDate;
            this.modifiedDate = modifiedDate;
        }

        public static /* synthetic */ Whatsapp copy$default(Whatsapp whatsapp, long j5, String str, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j5 = whatsapp.f30982id;
            }
            long j11 = j5;
            if ((i11 & 2) != 0) {
                str = whatsapp.phoneNumber;
            }
            String str2 = str;
            if ((i11 & 4) != 0) {
                dateTime = whatsapp.creationDate;
            }
            DateTime dateTime3 = dateTime;
            if ((i11 & 8) != 0) {
                dateTime2 = whatsapp.modifiedDate;
            }
            return whatsapp.copy(j11, str2, dateTime3, dateTime2);
        }

        public final long component1() {
            return this.f30982id;
        }

        public final String component2() {
            return this.phoneNumber;
        }

        public final DateTime component3() {
            return this.creationDate;
        }

        public final DateTime component4() {
            return this.modifiedDate;
        }

        public final Whatsapp copy(long j5, String phoneNumber, DateTime creationDate, DateTime modifiedDate) {
            u.j(phoneNumber, "phoneNumber");
            u.j(creationDate, "creationDate");
            u.j(modifiedDate, "modifiedDate");
            return new Whatsapp(j5, phoneNumber, creationDate, modifiedDate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Whatsapp)) {
                return false;
            }
            Whatsapp whatsapp = (Whatsapp) obj;
            if (this.f30982id == whatsapp.f30982id && u.e(this.phoneNumber, whatsapp.phoneNumber) && u.e(this.creationDate, whatsapp.creationDate) && u.e(this.modifiedDate, whatsapp.modifiedDate)) {
                return true;
            }
            return false;
        }

        public final DateTime getCreationDate() {
            return this.creationDate;
        }

        @Override // com.withings.account.models.TwoFactorAuthentication
        public long getId() {
            return this.f30982id;
        }

        public final DateTime getModifiedDate() {
            return this.modifiedDate;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }

        public int hashCode() {
            return this.modifiedDate.hashCode() + a.b(this.creationDate, d.c(this.phoneNumber, Long.hashCode(this.f30982id) * 31, 31), 31);
        }

        public String toString() {
            long j5 = this.f30982id;
            String str = this.phoneNumber;
            DateTime dateTime = this.creationDate;
            DateTime dateTime2 = this.modifiedDate;
            return "Whatsapp(id=" + j5 + ", phoneNumber=" + str + ", creationDate=" + dateTime + ", modifiedDate=" + dateTime2 + ")";
        }
    }

    public /* synthetic */ TwoFactorAuthentication(m mVar) {
        this();
    }

    public abstract long getId();

    private TwoFactorAuthentication() {
    }
}
