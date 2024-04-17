package com.withings.account.network.ws;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.o0;
import androidx.camera.camera2.internal.q2;
import androidx.work.impl.g;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.library.authentication.api.ConstantsWs;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import v6.b;
/* compiled from: WsAccount.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b?\b\u0087\b\u0018\u00002\u00020\u0001:\u0006GHIJKLB¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0018J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010)J\u0010\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010)J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\"J\t\u0010;\u001a\u00020\tHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003JÌ\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u00072\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\tHÖ\u0001J\t\u0010F\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0013\u0010\"R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b\u0014\u0010\"R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010%R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010*\u001a\u0004\b/\u0010)¨\u0006M"}, d2 = {"Lcom/withings/account/network/ws/WsAccount;", "", "id", "", "email", "", "hasPassword", "", ConstantsWs.JSON_ACCOUNT_KEY_DEBUG, "", "language", "timezone", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "flags", "Lcom/withings/account/network/ws/WsAccount$Flags;", "status", "state", "requestedEmail", "consumer", "isFqa", "isSqa", "modified", "touAccepted", "privacyPolicyAccepted", "(JLjava/lang/String;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/account/network/ws/WsAccount$Flags;IILjava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;JLjava/lang/Integer;Ljava/lang/Integer;)V", "getConsumer", "()I", "getContext", "()Ljava/lang/String;", "getDebug", "getEmail", "getFlags", "()Lcom/withings/account/network/ws/WsAccount$Flags;", "getHasPassword", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "()J", "getLanguage", "getModified", "getPrivacyPolicyAccepted", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRequestedEmail", "getState", "getStatus", "getTimezone", "getTouAccepted", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/Boolean;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/account/network/ws/WsAccount$Flags;IILjava/lang/String;ILjava/lang/Boolean;Ljava/lang/Boolean;JLjava/lang/Integer;Ljava/lang/Integer;)Lcom/withings/account/network/ws/WsAccount;", "equals", "other", "hashCode", "toString", "Advertising", "Context", "Flags", "Response", "SharedUnit", "Subscription", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WsAccount {
    public static final int $stable = 0;
    private final int consumer;
    private final String context;
    private final int debug;
    private final String email;
    private final Flags flags;
    @SerializedName("has_password")
    private final Boolean hasPassword;

    /* renamed from: id  reason: collision with root package name */
    private final long f31000id;
    @SerializedName(ConstantsWs.JSON_SESSION_KEY_ISFQA)
    private final Boolean isFqa;
    @SerializedName("is_sqa")
    private final Boolean isSqa;
    @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_PREFLANG)
    private final String language;
    private final long modified;
    @SerializedName("privacy_policy_accepted")
    private final Integer privacyPolicyAccepted;
    @SerializedName("requested_email")
    private final String requestedEmail;
    private final int state;
    private final int status;
    private final String timezone;
    @SerializedName("tou_accepted")
    private final Integer touAccepted;

    /* compiled from: WsAccount.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/withings/account/network/ws/WsAccount$Advertising;", "", "personalizedAds", "", "(I)V", "getPersonalizedAds", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Advertising {
        public static final int $stable = 0;
        @SerializedName("personalized")
        private final int personalizedAds;

        public Advertising() {
            this(0, 1, null);
        }

        public static /* synthetic */ Advertising copy$default(Advertising advertising, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = advertising.personalizedAds;
            }
            return advertising.copy(i11);
        }

        public final int component1() {
            return this.personalizedAds;
        }

        public final Advertising copy(int i11) {
            return new Advertising(i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Advertising) && this.personalizedAds == ((Advertising) obj).personalizedAds) {
                return true;
            }
            return false;
        }

        public final int getPersonalizedAds() {
            return this.personalizedAds;
        }

        public int hashCode() {
            return Integer.hashCode(this.personalizedAds);
        }

        public String toString() {
            return o0.a("Advertising(personalizedAds=", this.personalizedAds, ")");
        }

        public Advertising(int i11) {
            this.personalizedAds = i11;
        }

        public /* synthetic */ Advertising(int i11, int i12, m mVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }
    }

    /* compiled from: WsAccount.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/withings/account/network/ws/WsAccount$Context;", "Ljava/io/Serializable;", "sharedUnit", "Lcom/withings/account/network/ws/WsAccount$SharedUnit;", "subscription", "Lcom/withings/account/network/ws/WsAccount$Subscription;", "advertising", "Lcom/withings/account/network/ws/WsAccount$Advertising;", "(Lcom/withings/account/network/ws/WsAccount$SharedUnit;Lcom/withings/account/network/ws/WsAccount$Subscription;Lcom/withings/account/network/ws/WsAccount$Advertising;)V", "getAdvertising", "()Lcom/withings/account/network/ws/WsAccount$Advertising;", "getSharedUnit", "()Lcom/withings/account/network/ws/WsAccount$SharedUnit;", "getSubscription", "()Lcom/withings/account/network/ws/WsAccount$Subscription;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Context implements Serializable {
        public static final int $stable = 8;
        @SerializedName("ads")
        private final Advertising advertising;
        @SerializedName("sharedUnit")
        private final SharedUnit sharedUnit;
        @SerializedName("subscribed")
        private final Subscription subscription;

        public Context() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Context copy$default(Context context, SharedUnit sharedUnit, Subscription subscription, Advertising advertising, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sharedUnit = context.sharedUnit;
            }
            if ((i11 & 2) != 0) {
                subscription = context.subscription;
            }
            if ((i11 & 4) != 0) {
                advertising = context.advertising;
            }
            return context.copy(sharedUnit, subscription, advertising);
        }

        public final SharedUnit component1() {
            return this.sharedUnit;
        }

        public final Subscription component2() {
            return this.subscription;
        }

        public final Advertising component3() {
            return this.advertising;
        }

        public final Context copy(SharedUnit sharedUnit, Subscription subscription, Advertising advertising) {
            return new Context(sharedUnit, subscription, advertising);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Context)) {
                return false;
            }
            Context context = (Context) obj;
            if (u.e(this.sharedUnit, context.sharedUnit) && u.e(this.subscription, context.subscription) && u.e(this.advertising, context.advertising)) {
                return true;
            }
            return false;
        }

        public final Advertising getAdvertising() {
            return this.advertising;
        }

        public final SharedUnit getSharedUnit() {
            return this.sharedUnit;
        }

        public final Subscription getSubscription() {
            return this.subscription;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            SharedUnit sharedUnit = this.sharedUnit;
            int i11 = 0;
            if (sharedUnit == null) {
                hashCode = 0;
            } else {
                hashCode = sharedUnit.hashCode();
            }
            int i12 = hashCode * 31;
            Subscription subscription = this.subscription;
            if (subscription == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = subscription.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            Advertising advertising = this.advertising;
            if (advertising != null) {
                i11 = advertising.hashCode();
            }
            return i13 + i11;
        }

        public String toString() {
            SharedUnit sharedUnit = this.sharedUnit;
            Subscription subscription = this.subscription;
            Advertising advertising = this.advertising;
            return "Context(sharedUnit=" + sharedUnit + ", subscription=" + subscription + ", advertising=" + advertising + ")";
        }

        public Context(SharedUnit sharedUnit, Subscription subscription, Advertising advertising) {
            this.sharedUnit = sharedUnit;
            this.subscription = subscription;
            this.advertising = advertising;
        }

        public /* synthetic */ Context(SharedUnit sharedUnit, Subscription subscription, Advertising advertising, int i11, m mVar) {
            this((i11 & 1) != 0 ? null : sharedUnit, (i11 & 2) != 0 ? null : subscription, (i11 & 4) != 0 ? null : advertising);
        }
    }

    /* compiled from: WsAccount.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/withings/account/network/ws/WsAccount$Flags;", "", "wpm03AcknowledgmentRequired", "", "(Z)V", "getWpm03AcknowledgmentRequired", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Flags {
        public static final int $stable = 0;
        @SerializedName("wpm03_acknowledgment_required")
        private final boolean wpm03AcknowledgmentRequired;

        public Flags() {
            this(false, 1, null);
        }

        public static /* synthetic */ Flags copy$default(Flags flags, boolean z5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z5 = flags.wpm03AcknowledgmentRequired;
            }
            return flags.copy(z5);
        }

        public final boolean component1() {
            return this.wpm03AcknowledgmentRequired;
        }

        public final Flags copy(boolean z5) {
            return new Flags(z5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Flags) && this.wpm03AcknowledgmentRequired == ((Flags) obj).wpm03AcknowledgmentRequired) {
                return true;
            }
            return false;
        }

        public final boolean getWpm03AcknowledgmentRequired() {
            return this.wpm03AcknowledgmentRequired;
        }

        public int hashCode() {
            return Boolean.hashCode(this.wpm03AcknowledgmentRequired);
        }

        public String toString() {
            boolean z5 = this.wpm03AcknowledgmentRequired;
            return "Flags(wpm03AcknowledgmentRequired=" + z5 + ")";
        }

        public Flags(boolean z5) {
            this.wpm03AcknowledgmentRequired = z5;
        }

        public /* synthetic */ Flags(boolean z5, int i11, m mVar) {
            this((i11 & 1) != 0 ? false : z5);
        }
    }

    /* compiled from: WsAccount.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/account/network/ws/WsAccount$Response;", "", ConstantsWs.JSON_ACCOUNT_KEY_ACCOUNTS, "", "Lcom/withings/account/network/ws/WsAccount;", "(Ljava/util/List;)V", "account", "getAccount", "()Lcom/withings/account/network/ws/WsAccount;", "getAccounts", "()Ljava/util/List;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Response {
        public static final int $stable = 8;
        @SerializedName("account")
        private final List<WsAccount> accounts;

        public Response(List<WsAccount> accounts) {
            u.j(accounts, "accounts");
            this.accounts = accounts;
        }

        public final WsAccount getAccount() {
            return (WsAccount) x.I(this.accounts);
        }

        public final List<WsAccount> getAccounts() {
            return this.accounts;
        }
    }

    /* compiled from: WsAccount.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/withings/account/network/ws/WsAccount$SharedUnit;", "Ljava/io/Serializable;", "weight", "", "distance", "temperature", "height", "(IIII)V", "getDistance", "()I", "getHeight", "getTemperature", "getWeight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SharedUnit implements Serializable {
        public static final int $stable = 0;
        private final int distance;
        private final int height;
        private final int temperature;
        private final int weight;

        public SharedUnit(int i11, int i12, int i13, int i14) {
            this.weight = i11;
            this.distance = i12;
            this.temperature = i13;
            this.height = i14;
        }

        public static /* synthetic */ SharedUnit copy$default(SharedUnit sharedUnit, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i11 = sharedUnit.weight;
            }
            if ((i15 & 2) != 0) {
                i12 = sharedUnit.distance;
            }
            if ((i15 & 4) != 0) {
                i13 = sharedUnit.temperature;
            }
            if ((i15 & 8) != 0) {
                i14 = sharedUnit.height;
            }
            return sharedUnit.copy(i11, i12, i13, i14);
        }

        public final int component1() {
            return this.weight;
        }

        public final int component2() {
            return this.distance;
        }

        public final int component3() {
            return this.temperature;
        }

        public final int component4() {
            return this.height;
        }

        public final SharedUnit copy(int i11, int i12, int i13, int i14) {
            return new SharedUnit(i11, i12, i13, i14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SharedUnit)) {
                return false;
            }
            SharedUnit sharedUnit = (SharedUnit) obj;
            if (this.weight == sharedUnit.weight && this.distance == sharedUnit.distance && this.temperature == sharedUnit.temperature && this.height == sharedUnit.height) {
                return true;
            }
            return false;
        }

        public final int getDistance() {
            return this.distance;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getTemperature() {
            return this.temperature;
        }

        public final int getWeight() {
            return this.weight;
        }

        public int hashCode() {
            return Integer.hashCode(this.height) + h.a(this.temperature, h.a(this.distance, Integer.hashCode(this.weight) * 31, 31), 31);
        }

        public String toString() {
            int i11 = this.weight;
            int i12 = this.distance;
            int i13 = this.temperature;
            int i14 = this.height;
            StringBuilder e11 = h.e("SharedUnit(weight=", i11, ", distance=", i12, ", temperature=");
            e11.append(i13);
            e11.append(", height=");
            e11.append(i14);
            e11.append(")");
            return e11.toString();
        }
    }

    /* compiled from: WsAccount.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006&"}, d2 = {"Lcom/withings/account/network/ws/WsAccount$Subscription;", "Ljava/io/Serializable;", "discount", "", "newsletter", "study", "report", RemoteMessageConst.NOTIFICATION, ConstantsWs.WELLNESS_TASK_TYPE_SURVEY, "(IIIIII)V", "getDiscount", "()I", "setDiscount", "(I)V", "getNewsletter", "setNewsletter", "getNotification", "setNotification", "getReport", "setReport", "getStudy", "setStudy", "getSurvey", "setSurvey", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Subscription implements Serializable {
        public static final int $stable = 8;
        private int discount;
        private int newsletter;
        private int notification;
        private int report;
        private int study;
        private int survey;

        public Subscription() {
            this(0, 0, 0, 0, 0, 0, 63, null);
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
            if ((i17 & 1) != 0) {
                i11 = subscription.discount;
            }
            if ((i17 & 2) != 0) {
                i12 = subscription.newsletter;
            }
            int i18 = i12;
            if ((i17 & 4) != 0) {
                i13 = subscription.study;
            }
            int i19 = i13;
            if ((i17 & 8) != 0) {
                i14 = subscription.report;
            }
            int i21 = i14;
            if ((i17 & 16) != 0) {
                i15 = subscription.notification;
            }
            int i22 = i15;
            if ((i17 & 32) != 0) {
                i16 = subscription.survey;
            }
            return subscription.copy(i11, i18, i19, i21, i22, i16);
        }

        public final int component1() {
            return this.discount;
        }

        public final int component2() {
            return this.newsletter;
        }

        public final int component3() {
            return this.study;
        }

        public final int component4() {
            return this.report;
        }

        public final int component5() {
            return this.notification;
        }

        public final int component6() {
            return this.survey;
        }

        public final Subscription copy(int i11, int i12, int i13, int i14, int i15, int i16) {
            return new Subscription(i11, i12, i13, i14, i15, i16);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            if (this.discount == subscription.discount && this.newsletter == subscription.newsletter && this.study == subscription.study && this.report == subscription.report && this.notification == subscription.notification && this.survey == subscription.survey) {
                return true;
            }
            return false;
        }

        public final int getDiscount() {
            return this.discount;
        }

        public final int getNewsletter() {
            return this.newsletter;
        }

        public final int getNotification() {
            return this.notification;
        }

        public final int getReport() {
            return this.report;
        }

        public final int getStudy() {
            return this.study;
        }

        public final int getSurvey() {
            return this.survey;
        }

        public int hashCode() {
            return Integer.hashCode(this.survey) + h.a(this.notification, h.a(this.report, h.a(this.study, h.a(this.newsletter, Integer.hashCode(this.discount) * 31, 31), 31), 31), 31);
        }

        public final void setDiscount(int i11) {
            this.discount = i11;
        }

        public final void setNewsletter(int i11) {
            this.newsletter = i11;
        }

        public final void setNotification(int i11) {
            this.notification = i11;
        }

        public final void setReport(int i11) {
            this.report = i11;
        }

        public final void setStudy(int i11) {
            this.study = i11;
        }

        public final void setSurvey(int i11) {
            this.survey = i11;
        }

        public String toString() {
            int i11 = this.discount;
            int i12 = this.newsletter;
            int i13 = this.study;
            int i14 = this.report;
            int i15 = this.notification;
            int i16 = this.survey;
            StringBuilder e11 = h.e("Subscription(discount=", i11, ", newsletter=", i12, ", study=");
            b.a(e11, i13, ", report=", i14, ", notification=");
            e11.append(i15);
            e11.append(", survey=");
            e11.append(i16);
            e11.append(")");
            return e11.toString();
        }

        public Subscription(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.discount = i11;
            this.newsletter = i12;
            this.study = i13;
            this.report = i14;
            this.notification = i15;
            this.survey = i16;
        }

        public /* synthetic */ Subscription(int i11, int i12, int i13, int i14, int i15, int i16, int i17, m mVar) {
            this((i17 & 1) != 0 ? 0 : i11, (i17 & 2) != 0 ? 0 : i12, (i17 & 4) != 0 ? 0 : i13, (i17 & 8) != 0 ? 0 : i14, (i17 & 16) != 0 ? 0 : i15, (i17 & 32) != 0 ? 0 : i16);
        }
    }

    public WsAccount(long j5, String email, Boolean bool, int i11, String str, String str2, String str3, Flags flags, int i12, int i13, String str4, int i14, Boolean bool2, Boolean bool3, long j11, Integer num, Integer num2) {
        u.j(email, "email");
        this.f31000id = j5;
        this.email = email;
        this.hasPassword = bool;
        this.debug = i11;
        this.language = str;
        this.timezone = str2;
        this.context = str3;
        this.flags = flags;
        this.status = i12;
        this.state = i13;
        this.requestedEmail = str4;
        this.consumer = i14;
        this.isFqa = bool2;
        this.isSqa = bool3;
        this.modified = j11;
        this.touAccepted = num;
        this.privacyPolicyAccepted = num2;
    }

    public final long component1() {
        return this.f31000id;
    }

    public final int component10() {
        return this.state;
    }

    public final String component11() {
        return this.requestedEmail;
    }

    public final int component12() {
        return this.consumer;
    }

    public final Boolean component13() {
        return this.isFqa;
    }

    public final Boolean component14() {
        return this.isSqa;
    }

    public final long component15() {
        return this.modified;
    }

    public final Integer component16() {
        return this.touAccepted;
    }

    public final Integer component17() {
        return this.privacyPolicyAccepted;
    }

    public final String component2() {
        return this.email;
    }

    public final Boolean component3() {
        return this.hasPassword;
    }

    public final int component4() {
        return this.debug;
    }

    public final String component5() {
        return this.language;
    }

    public final String component6() {
        return this.timezone;
    }

    public final String component7() {
        return this.context;
    }

    public final Flags component8() {
        return this.flags;
    }

    public final int component9() {
        return this.status;
    }

    public final WsAccount copy(long j5, String email, Boolean bool, int i11, String str, String str2, String str3, Flags flags, int i12, int i13, String str4, int i14, Boolean bool2, Boolean bool3, long j11, Integer num, Integer num2) {
        u.j(email, "email");
        return new WsAccount(j5, email, bool, i11, str, str2, str3, flags, i12, i13, str4, i14, bool2, bool3, j11, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsAccount)) {
            return false;
        }
        WsAccount wsAccount = (WsAccount) obj;
        if (this.f31000id == wsAccount.f31000id && u.e(this.email, wsAccount.email) && u.e(this.hasPassword, wsAccount.hasPassword) && this.debug == wsAccount.debug && u.e(this.language, wsAccount.language) && u.e(this.timezone, wsAccount.timezone) && u.e(this.context, wsAccount.context) && u.e(this.flags, wsAccount.flags) && this.status == wsAccount.status && this.state == wsAccount.state && u.e(this.requestedEmail, wsAccount.requestedEmail) && this.consumer == wsAccount.consumer && u.e(this.isFqa, wsAccount.isFqa) && u.e(this.isSqa, wsAccount.isSqa) && this.modified == wsAccount.modified && u.e(this.touAccepted, wsAccount.touAccepted) && u.e(this.privacyPolicyAccepted, wsAccount.privacyPolicyAccepted)) {
            return true;
        }
        return false;
    }

    public final int getConsumer() {
        return this.consumer;
    }

    public final String getContext() {
        return this.context;
    }

    public final int getDebug() {
        return this.debug;
    }

    public final String getEmail() {
        return this.email;
    }

    public final Flags getFlags() {
        return this.flags;
    }

    public final Boolean getHasPassword() {
        return this.hasPassword;
    }

    public final long getId() {
        return this.f31000id;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final long getModified() {
        return this.modified;
    }

    public final Integer getPrivacyPolicyAccepted() {
        return this.privacyPolicyAccepted;
    }

    public final String getRequestedEmail() {
        return this.requestedEmail;
    }

    public final int getState() {
        return this.state;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final Integer getTouAccepted() {
        return this.touAccepted;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int c11 = d.c(this.email, Long.hashCode(this.f31000id) * 31, 31);
        Boolean bool = this.hasPassword;
        int i11 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int a11 = h.a(this.debug, (c11 + hashCode) * 31, 31);
        String str = this.language;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (a11 + hashCode2) * 31;
        String str2 = this.timezone;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str3 = this.context;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Flags flags = this.flags;
        if (flags == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = flags.hashCode();
        }
        int a12 = h.a(this.state, h.a(this.status, (i14 + hashCode5) * 31, 31), 31);
        String str4 = this.requestedEmail;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int a13 = h.a(this.consumer, (a12 + hashCode6) * 31, 31);
        Boolean bool2 = this.isFqa;
        if (bool2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool2.hashCode();
        }
        int i15 = (a13 + hashCode7) * 31;
        Boolean bool3 = this.isSqa;
        if (bool3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = bool3.hashCode();
        }
        int a14 = c.a(this.modified, (i15 + hashCode8) * 31, 31);
        Integer num = this.touAccepted;
        if (num == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num.hashCode();
        }
        int i16 = (a14 + hashCode9) * 31;
        Integer num2 = this.privacyPolicyAccepted;
        if (num2 != null) {
            i11 = num2.hashCode();
        }
        return i16 + i11;
    }

    public final Boolean isFqa() {
        return this.isFqa;
    }

    public final Boolean isSqa() {
        return this.isSqa;
    }

    public String toString() {
        long j5 = this.f31000id;
        String str = this.email;
        Boolean bool = this.hasPassword;
        int i11 = this.debug;
        String str2 = this.language;
        String str3 = this.timezone;
        String str4 = this.context;
        Flags flags = this.flags;
        int i12 = this.status;
        int i13 = this.state;
        String str5 = this.requestedEmail;
        int i14 = this.consumer;
        Boolean bool2 = this.isFqa;
        Boolean bool3 = this.isSqa;
        long j11 = this.modified;
        Integer num = this.touAccepted;
        Integer num2 = this.privacyPolicyAccepted;
        StringBuilder sb2 = new StringBuilder("WsAccount(id=");
        sb2.append(j5);
        sb2.append(", email=");
        sb2.append(str);
        sb2.append(", hasPassword=");
        sb2.append(bool);
        sb2.append(", debug=");
        sb2.append(i11);
        b.d(sb2, ", language=", str2, ", timezone=", str3);
        sb2.append(", context=");
        sb2.append(str4);
        sb2.append(", flags=");
        sb2.append(flags);
        q2.c(sb2, ", status=", i12, ", state=", i13);
        sb2.append(", requestedEmail=");
        sb2.append(str5);
        sb2.append(", consumer=");
        sb2.append(i14);
        sb2.append(", isFqa=");
        sb2.append(bool2);
        sb2.append(", isSqa=");
        sb2.append(bool3);
        g.d(sb2, ", modified=", j11, ", touAccepted=");
        sb2.append(num);
        sb2.append(", privacyPolicyAccepted=");
        sb2.append(num2);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ WsAccount(long j5, String str, Boolean bool, int i11, String str2, String str3, String str4, Flags flags, int i12, int i13, String str5, int i14, Boolean bool2, Boolean bool3, long j11, Integer num, Integer num2, int i15, m mVar) {
        this(j5, str, bool, i11, str2, str3, str4, flags, i12, i13, str5, i14, bool2, bool3, j11, (i15 & Utils.MAX_EVENT_SIZE) != 0 ? null : num, (i15 & 65536) != 0 ? null : num2);
    }
}
