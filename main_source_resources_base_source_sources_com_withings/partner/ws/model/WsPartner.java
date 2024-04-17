package com.withings.partner.ws.model;

import androidx.compose.material3.d;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.apache.http.cookie.ClientCookie;
/* compiled from: WsPartner.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000eJ\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010/\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00100\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001cJx\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\u0003HÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0010\"\u0004\b%\u0010\u0012R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010\u0012¨\u00068"}, d2 = {"Lcom/withings/partner/ws/model/WsPartner;", "", "consumer", "", "clientId", "", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, CommonConstant.KEY_ACCESS_TOKEN, "refreshToken", ConstantsWs.CONFIDENTIAL_IE_FIELDS_SECRET, ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "", ClientCookie.EXPIRES_ATTR, "modified", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "getClientId", "setClientId", "getConsumer", "()I", "setConsumer", "(I)V", "getContext", "setContext", "getCreated", "()Ljava/lang/Long;", "setCreated", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getExpires", "setExpires", "getModified", "setModified", "getRefreshToken", "setRefreshToken", "getSecret", "setSecret", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/withings/partner/ws/model/WsPartner;", "equals", "", "other", "hashCode", "toString", "partner_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsPartner {
    @SerializedName("access_token")
    private String accessToken;
    @SerializedName("clientId")
    private String clientId;
    @SerializedName("consumer")
    private int consumer;
    @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT)
    private String context;
    @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
    private Long created;
    @SerializedName(ClientCookie.EXPIRES_ATTR)
    private Long expires;
    @SerializedName("modified")
    private Long modified;
    @SerializedName("refresh_token")
    private String refreshToken;
    @SerializedName(ConstantsWs.CONFIDENTIAL_IE_FIELDS_SECRET)
    private String secret;

    public WsPartner() {
        this(0, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ WsPartner copy$default(WsPartner wsPartner, int i11, String str, String str2, String str3, String str4, String str5, Long l5, Long l6, Long l11, int i12, Object obj) {
        int i13;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Long l12;
        Long l13;
        Long l14;
        if ((i12 & 1) != 0) {
            i13 = wsPartner.consumer;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            str6 = wsPartner.clientId;
        } else {
            str6 = str;
        }
        if ((i12 & 4) != 0) {
            str7 = wsPartner.context;
        } else {
            str7 = str2;
        }
        if ((i12 & 8) != 0) {
            str8 = wsPartner.accessToken;
        } else {
            str8 = str3;
        }
        if ((i12 & 16) != 0) {
            str9 = wsPartner.refreshToken;
        } else {
            str9 = str4;
        }
        if ((i12 & 32) != 0) {
            str10 = wsPartner.secret;
        } else {
            str10 = str5;
        }
        if ((i12 & 64) != 0) {
            l12 = wsPartner.created;
        } else {
            l12 = l5;
        }
        if ((i12 & 128) != 0) {
            l13 = wsPartner.expires;
        } else {
            l13 = l6;
        }
        if ((i12 & 256) != 0) {
            l14 = wsPartner.modified;
        } else {
            l14 = l11;
        }
        return wsPartner.copy(i13, str6, str7, str8, str9, str10, l12, l13, l14);
    }

    public final int component1() {
        return this.consumer;
    }

    public final String component2() {
        return this.clientId;
    }

    public final String component3() {
        return this.context;
    }

    public final String component4() {
        return this.accessToken;
    }

    public final String component5() {
        return this.refreshToken;
    }

    public final String component6() {
        return this.secret;
    }

    public final Long component7() {
        return this.created;
    }

    public final Long component8() {
        return this.expires;
    }

    public final Long component9() {
        return this.modified;
    }

    public final WsPartner copy(int i11, String str, String str2, String str3, String str4, String str5, Long l5, Long l6, Long l11) {
        return new WsPartner(i11, str, str2, str3, str4, str5, l5, l6, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsPartner)) {
            return false;
        }
        WsPartner wsPartner = (WsPartner) obj;
        if (this.consumer == wsPartner.consumer && u.e(this.clientId, wsPartner.clientId) && u.e(this.context, wsPartner.context) && u.e(this.accessToken, wsPartner.accessToken) && u.e(this.refreshToken, wsPartner.refreshToken) && u.e(this.secret, wsPartner.secret) && u.e(this.created, wsPartner.created) && u.e(this.expires, wsPartner.expires) && u.e(this.modified, wsPartner.modified)) {
            return true;
        }
        return false;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final int getConsumer() {
        return this.consumer;
    }

    public final String getContext() {
        return this.context;
    }

    public final Long getCreated() {
        return this.created;
    }

    public final Long getExpires() {
        return this.expires;
    }

    public final Long getModified() {
        return this.modified;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final String getSecret() {
        return this.secret;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = Integer.hashCode(this.consumer) * 31;
        String str = this.clientId;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode8 + hashCode) * 31;
        String str2 = this.context;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str3 = this.accessToken;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str4 = this.refreshToken;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str5 = this.secret;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        Long l5 = this.created;
        if (l5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l5.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        Long l6 = this.expires;
        if (l6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = l6.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        Long l11 = this.modified;
        if (l11 != null) {
            i11 = l11.hashCode();
        }
        return i18 + i11;
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final void setClientId(String str) {
        this.clientId = str;
    }

    public final void setConsumer(int i11) {
        this.consumer = i11;
    }

    public final void setContext(String str) {
        this.context = str;
    }

    public final void setCreated(Long l5) {
        this.created = l5;
    }

    public final void setExpires(Long l5) {
        this.expires = l5;
    }

    public final void setModified(Long l5) {
        this.modified = l5;
    }

    public final void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public final void setSecret(String str) {
        this.secret = str;
    }

    public String toString() {
        int i11 = this.consumer;
        String str = this.clientId;
        String str2 = this.context;
        String str3 = this.accessToken;
        String str4 = this.refreshToken;
        String str5 = this.secret;
        Long l5 = this.created;
        Long l6 = this.expires;
        Long l11 = this.modified;
        StringBuilder a11 = d.a("WsPartner(consumer=", i11, ", clientId=", str, ", context=");
        b.d(a11, str2, ", accessToken=", str3, ", refreshToken=");
        b.d(a11, str4, ", secret=", str5, ", created=");
        a11.append(l5);
        a11.append(", expires=");
        a11.append(l6);
        a11.append(", modified=");
        a11.append(l11);
        a11.append(")");
        return a11.toString();
    }

    public WsPartner(int i11, String str, String str2, String str3, String str4, String str5, Long l5, Long l6, Long l11) {
        this.consumer = i11;
        this.clientId = str;
        this.context = str2;
        this.accessToken = str3;
        this.refreshToken = str4;
        this.secret = str5;
        this.created = l5;
        this.expires = l6;
        this.modified = l11;
    }

    public /* synthetic */ WsPartner(int i11, String str, String str2, String str3, String str4, String str5, Long l5, Long l6, Long l11, int i12, m mVar) {
        this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, (i12 & 64) != 0 ? null : l5, (i12 & 128) != 0 ? null : l6, (i12 & 256) == 0 ? l11 : null);
    }
}
