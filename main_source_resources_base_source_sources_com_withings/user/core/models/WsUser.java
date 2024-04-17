package com.withings.user.core.models;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import com.google.android.gms.internal.mlkit_common.a;
import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: WsUser.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000 d2\u00020\u0001:\u0002deBõ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010 \u001a\u00020\t¢\u0006\u0002\u0010!J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u000eHÆ\u0003J\t\u0010G\u001a\u00020\u000eHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010T\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\t\u0010U\u001a\u00020\tHÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010X\u001a\u00020\tHÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010[\u001a\u00020\tHÆ\u0003J\t\u0010\\\u001a\u00020\u000eHÆ\u0003J²\u0002\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010^J\u0013\u0010_\u001a\u00020`2\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020\tHÖ\u0001J\t\u0010c\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0016\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#R\u0016\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00101R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010#R\u0016\u0010 \u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010#R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010#R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010#R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010#R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010#R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010#R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010#R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010#R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010#¨\u0006f"}, d2 = {"Lcom/withings/user/core/models/WsUser;", "", "id", "", "firstName", "", "lastName", "shortName", "gender", "", "advancedGender", "pronoun", "fatMethod", "birthDate", "Lorg/joda/time/DateTime;", "parentAccountId", "email", "creationDate", "modificationDate", "wam01Screens", "ws30Screens", "ws50Screens", "ws45Screens", "wbs04Screens", "wbs06Screens", "hwa03Screens", "wam03Screens", "workoutScreens", "wam01Config", "bodyModel", "images", "Lcom/withings/user/core/models/WsImages;", "userType", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILorg/joda/time/DateTime;JLjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withings/user/core/models/WsImages;I)V", "getAdvancedGender", "()Ljava/lang/String;", "getBirthDate", "()Lorg/joda/time/DateTime;", "getBodyModel", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCreationDate", "getEmail", "getFatMethod", "()I", "getFirstName", "getGender", "getHwa03Screens", "getId", "()J", "getImages", "()Lcom/withings/user/core/models/WsImages;", "getLastName", "getModificationDate", "getParentAccountId", "getPronoun", "getShortName", "getUserType", "getWam01Config", "getWam01Screens", "getWam03Screens", "getWbs04Screens", "getWbs06Screens", "getWorkoutScreens", "getWs30Screens", "getWs45Screens", "getWs50Screens", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILorg/joda/time/DateTime;JLjava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/withings/user/core/models/WsImages;I)Lcom/withings/user/core/models/WsUser;", "equals", "", "other", "hashCode", "toString", "Companion", "Response", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsUser {
    public static final Companion Companion = new Companion(null);
    public static final String WAM01_AUTO_WAKEUP_VALUE_OFF = "autowakeupDisabled";
    public static final String WAM01_AUTO_WAKEUP_VALUE_ON = "autowakeupEnabled";
    public static final String WAM01_CONFIG_KEY = "config_wam01";
    @SerializedName("advanced_gender")
    private final String advancedGender;
    @SerializedName(ConstantsWs.AUTHENTICATION_TYPE_BIRTHDATE)
    private final DateTime birthDate;
    @SerializedName("bodymodel")
    private final Integer bodyModel;
    @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_CREATED)
    private final DateTime creationDate;
    @SerializedName("email")
    private final String email;
    @SerializedName("fatmethod")
    private final int fatMethod;
    @SerializedName("firstname")
    private final String firstName;
    @SerializedName("gender")
    private final int gender;
    @SerializedName("screens_hwa03")
    private final String hwa03Screens;
    @SerializedName("id")

    /* renamed from: id  reason: collision with root package name */
    private final long f46340id;
    @SerializedName("p4")
    private final WsImages images;
    @SerializedName("lastname")
    private final String lastName;
    @SerializedName("modified")
    private final DateTime modificationDate;
    @SerializedName("idparentaccount")
    private final long parentAccountId;
    @SerializedName("pronouns")
    private final String pronoun;
    @SerializedName("shortname")
    private final String shortName;
    @SerializedName("usertype")
    private final int userType;
    @SerializedName(WAM01_CONFIG_KEY)
    private final String wam01Config;
    @SerializedName("screens_wam01")
    private final String wam01Screens;
    @SerializedName("screens_wam03")
    private final String wam03Screens;
    @SerializedName("screens_wbs04")
    private final String wbs04Screens;
    @SerializedName("screens_wbs06")
    private final String wbs06Screens;
    @SerializedName("screens_workout")
    private final String workoutScreens;
    @SerializedName("screens_ws30")
    private final String ws30Screens;
    @SerializedName("screens_ws45")
    private final String ws45Screens;
    @SerializedName("screens_ws50")
    private final String ws50Screens;

    /* compiled from: WsUser.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/withings/user/core/models/WsUser$Companion;", "", "()V", "WAM01_AUTO_WAKEUP_VALUE_OFF", "", "WAM01_AUTO_WAKEUP_VALUE_ON", "WAM01_CONFIG_KEY", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: WsUser.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/user/core/models/WsUser$Response;", "", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/core/models/WsUser;", "(Lcom/withings/user/core/models/WsUser;)V", "getUser", "()Lcom/withings/user/core/models/WsUser;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Response {
        @SerializedName(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT)
        private final WsUser user;

        public Response(WsUser wsUser) {
            this.user = wsUser;
        }

        public static /* synthetic */ Response copy$default(Response response, WsUser wsUser, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                wsUser = response.user;
            }
            return response.copy(wsUser);
        }

        public final WsUser component1() {
            return this.user;
        }

        public final Response copy(WsUser wsUser) {
            return new Response(wsUser);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof Response) && u.e(this.user, ((Response) obj).user)) {
                return true;
            }
            return false;
        }

        public final WsUser getUser() {
            return this.user;
        }

        public int hashCode() {
            WsUser wsUser = this.user;
            if (wsUser == null) {
                return 0;
            }
            return wsUser.hashCode();
        }

        public String toString() {
            WsUser wsUser = this.user;
            return "Response(user=" + wsUser + ")";
        }
    }

    public WsUser(long j5, String firstName, String lastName, String str, int i11, String str2, String str3, int i12, DateTime birthDate, long j11, String str4, DateTime creationDate, DateTime modificationDate, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, WsImages wsImages, int i13) {
        u.j(firstName, "firstName");
        u.j(lastName, "lastName");
        u.j(birthDate, "birthDate");
        u.j(creationDate, "creationDate");
        u.j(modificationDate, "modificationDate");
        this.f46340id = j5;
        this.firstName = firstName;
        this.lastName = lastName;
        this.shortName = str;
        this.gender = i11;
        this.advancedGender = str2;
        this.pronoun = str3;
        this.fatMethod = i12;
        this.birthDate = birthDate;
        this.parentAccountId = j11;
        this.email = str4;
        this.creationDate = creationDate;
        this.modificationDate = modificationDate;
        this.wam01Screens = str5;
        this.ws30Screens = str6;
        this.ws50Screens = str7;
        this.ws45Screens = str8;
        this.wbs04Screens = str9;
        this.wbs06Screens = str10;
        this.hwa03Screens = str11;
        this.wam03Screens = str12;
        this.workoutScreens = str13;
        this.wam01Config = str14;
        this.bodyModel = num;
        this.images = wsImages;
        this.userType = i13;
    }

    public final long component1() {
        return this.f46340id;
    }

    public final long component10() {
        return this.parentAccountId;
    }

    public final String component11() {
        return this.email;
    }

    public final DateTime component12() {
        return this.creationDate;
    }

    public final DateTime component13() {
        return this.modificationDate;
    }

    public final String component14() {
        return this.wam01Screens;
    }

    public final String component15() {
        return this.ws30Screens;
    }

    public final String component16() {
        return this.ws50Screens;
    }

    public final String component17() {
        return this.ws45Screens;
    }

    public final String component18() {
        return this.wbs04Screens;
    }

    public final String component19() {
        return this.wbs06Screens;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component20() {
        return this.hwa03Screens;
    }

    public final String component21() {
        return this.wam03Screens;
    }

    public final String component22() {
        return this.workoutScreens;
    }

    public final String component23() {
        return this.wam01Config;
    }

    public final Integer component24() {
        return this.bodyModel;
    }

    public final WsImages component25() {
        return this.images;
    }

    public final int component26() {
        return this.userType;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.shortName;
    }

    public final int component5() {
        return this.gender;
    }

    public final String component6() {
        return this.advancedGender;
    }

    public final String component7() {
        return this.pronoun;
    }

    public final int component8() {
        return this.fatMethod;
    }

    public final DateTime component9() {
        return this.birthDate;
    }

    public final WsUser copy(long j5, String firstName, String lastName, String str, int i11, String str2, String str3, int i12, DateTime birthDate, long j11, String str4, DateTime creationDate, DateTime modificationDate, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, WsImages wsImages, int i13) {
        u.j(firstName, "firstName");
        u.j(lastName, "lastName");
        u.j(birthDate, "birthDate");
        u.j(creationDate, "creationDate");
        u.j(modificationDate, "modificationDate");
        return new WsUser(j5, firstName, lastName, str, i11, str2, str3, i12, birthDate, j11, str4, creationDate, modificationDate, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, num, wsImages, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsUser)) {
            return false;
        }
        WsUser wsUser = (WsUser) obj;
        if (this.f46340id == wsUser.f46340id && u.e(this.firstName, wsUser.firstName) && u.e(this.lastName, wsUser.lastName) && u.e(this.shortName, wsUser.shortName) && this.gender == wsUser.gender && u.e(this.advancedGender, wsUser.advancedGender) && u.e(this.pronoun, wsUser.pronoun) && this.fatMethod == wsUser.fatMethod && u.e(this.birthDate, wsUser.birthDate) && this.parentAccountId == wsUser.parentAccountId && u.e(this.email, wsUser.email) && u.e(this.creationDate, wsUser.creationDate) && u.e(this.modificationDate, wsUser.modificationDate) && u.e(this.wam01Screens, wsUser.wam01Screens) && u.e(this.ws30Screens, wsUser.ws30Screens) && u.e(this.ws50Screens, wsUser.ws50Screens) && u.e(this.ws45Screens, wsUser.ws45Screens) && u.e(this.wbs04Screens, wsUser.wbs04Screens) && u.e(this.wbs06Screens, wsUser.wbs06Screens) && u.e(this.hwa03Screens, wsUser.hwa03Screens) && u.e(this.wam03Screens, wsUser.wam03Screens) && u.e(this.workoutScreens, wsUser.workoutScreens) && u.e(this.wam01Config, wsUser.wam01Config) && u.e(this.bodyModel, wsUser.bodyModel) && u.e(this.images, wsUser.images) && this.userType == wsUser.userType) {
            return true;
        }
        return false;
    }

    public final String getAdvancedGender() {
        return this.advancedGender;
    }

    public final DateTime getBirthDate() {
        return this.birthDate;
    }

    public final Integer getBodyModel() {
        return this.bodyModel;
    }

    public final DateTime getCreationDate() {
        return this.creationDate;
    }

    public final String getEmail() {
        return this.email;
    }

    public final int getFatMethod() {
        return this.fatMethod;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final int getGender() {
        return this.gender;
    }

    public final String getHwa03Screens() {
        return this.hwa03Screens;
    }

    public final long getId() {
        return this.f46340id;
    }

    public final WsImages getImages() {
        return this.images;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final DateTime getModificationDate() {
        return this.modificationDate;
    }

    public final long getParentAccountId() {
        return this.parentAccountId;
    }

    public final String getPronoun() {
        return this.pronoun;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final int getUserType() {
        return this.userType;
    }

    public final String getWam01Config() {
        return this.wam01Config;
    }

    public final String getWam01Screens() {
        return this.wam01Screens;
    }

    public final String getWam03Screens() {
        return this.wam03Screens;
    }

    public final String getWbs04Screens() {
        return this.wbs04Screens;
    }

    public final String getWbs06Screens() {
        return this.wbs06Screens;
    }

    public final String getWorkoutScreens() {
        return this.workoutScreens;
    }

    public final String getWs30Screens() {
        return this.ws30Screens;
    }

    public final String getWs45Screens() {
        return this.ws45Screens;
    }

    public final String getWs50Screens() {
        return this.ws50Screens;
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
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int c11 = d.c(this.lastName, d.c(this.firstName, Long.hashCode(this.f46340id) * 31, 31), 31);
        String str = this.shortName;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a11 = h.a(this.gender, (c11 + hashCode) * 31, 31);
        String str2 = this.advancedGender;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (a11 + hashCode2) * 31;
        String str3 = this.pronoun;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int a12 = c.a(this.parentAccountId, a.b(this.birthDate, h.a(this.fatMethod, (i12 + hashCode3) * 31, 31), 31), 31);
        String str4 = this.email;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int b10 = a.b(this.modificationDate, a.b(this.creationDate, (a12 + hashCode4) * 31, 31), 31);
        String str5 = this.wam01Screens;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (b10 + hashCode5) * 31;
        String str6 = this.ws30Screens;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.ws50Screens;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str8 = this.ws45Screens;
        if (str8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str8.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str9 = this.wbs04Screens;
        if (str9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str9.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        String str10 = this.wbs06Screens;
        if (str10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str10.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        String str11 = this.hwa03Screens;
        if (str11 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str11.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        String str12 = this.wam03Screens;
        if (str12 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str12.hashCode();
        }
        int i21 = (i19 + hashCode12) * 31;
        String str13 = this.workoutScreens;
        if (str13 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str13.hashCode();
        }
        int i22 = (i21 + hashCode13) * 31;
        String str14 = this.wam01Config;
        if (str14 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str14.hashCode();
        }
        int i23 = (i22 + hashCode14) * 31;
        Integer num = this.bodyModel;
        if (num == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = num.hashCode();
        }
        int i24 = (i23 + hashCode15) * 31;
        WsImages wsImages = this.images;
        if (wsImages != null) {
            i11 = wsImages.hashCode();
        }
        return Integer.hashCode(this.userType) + ((i24 + i11) * 31);
    }

    public String toString() {
        long j5 = this.f46340id;
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.shortName;
        int i11 = this.gender;
        String str4 = this.advancedGender;
        String str5 = this.pronoun;
        int i12 = this.fatMethod;
        DateTime dateTime = this.birthDate;
        long j11 = this.parentAccountId;
        String str6 = this.email;
        DateTime dateTime2 = this.creationDate;
        DateTime dateTime3 = this.modificationDate;
        String str7 = this.wam01Screens;
        String str8 = this.ws30Screens;
        String str9 = this.ws50Screens;
        String str10 = this.ws45Screens;
        String str11 = this.wbs04Screens;
        String str12 = this.wbs06Screens;
        String str13 = this.hwa03Screens;
        String str14 = this.wam03Screens;
        String str15 = this.workoutScreens;
        String str16 = this.wam01Config;
        Integer num = this.bodyModel;
        WsImages wsImages = this.images;
        int i13 = this.userType;
        StringBuilder sb2 = new StringBuilder("WsUser(id=");
        sb2.append(j5);
        sb2.append(", firstName=");
        sb2.append(str);
        b.d(sb2, ", lastName=", str2, ", shortName=", str3);
        sb2.append(", gender=");
        sb2.append(i11);
        sb2.append(", advancedGender=");
        sb2.append(str4);
        sb2.append(", pronoun=");
        sb2.append(str5);
        sb2.append(", fatMethod=");
        sb2.append(i12);
        sb2.append(", birthDate=");
        sb2.append(dateTime);
        sb2.append(", parentAccountId=");
        sb2.append(j11);
        sb2.append(", email=");
        sb2.append(str6);
        sb2.append(", creationDate=");
        sb2.append(dateTime2);
        sb2.append(", modificationDate=");
        sb2.append(dateTime3);
        b.d(sb2, ", wam01Screens=", str7, ", ws30Screens=", str8);
        b.d(sb2, ", ws50Screens=", str9, ", ws45Screens=", str10);
        b.d(sb2, ", wbs04Screens=", str11, ", wbs06Screens=", str12);
        b.d(sb2, ", hwa03Screens=", str13, ", wam03Screens=", str14);
        b.d(sb2, ", workoutScreens=", str15, ", wam01Config=", str16);
        sb2.append(", bodyModel=");
        sb2.append(num);
        sb2.append(", images=");
        sb2.append(wsImages);
        sb2.append(", userType=");
        sb2.append(i13);
        sb2.append(")");
        return sb2.toString();
    }
}
