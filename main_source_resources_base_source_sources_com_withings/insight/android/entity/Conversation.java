package com.withings.insight.android.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.y1;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.rudderstack.android.sdk.core.util.Utils;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import com.withings.contentproviders.eightfit.model.webservice.a;
import dp0.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import okhttp3.internal.http2.Http2;
/* compiled from: Conversation.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0001\u0012\u0006\u0010 \u001a\u00020\u0007\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010$\u001a\u00020\u0007\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e\u0012\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\u0006\u0010*\u001a\u00020\u0007\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010.\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bY\u0010ZJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ\u0010\u0010\r\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\r\u0010\tJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\tJ\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0004J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\tJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJì\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00072\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010$\u001a\u00020\u00072\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0010\b\u0002\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\b\b\u0002\u0010*\u001a\u00020\u00072\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e2\b\b\u0002\u0010,\u001a\u00020\u00022\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b2\u0010\tJ\u0010\u00104\u001a\u000203HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u000203HÖ\u0001¢\u0006\u0004\b:\u00105J \u0010?\u001a\u00020>2\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u000203HÖ\u0001¢\u0006\u0004\b?\u0010@R\u001a\u0010 \u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010A\u001a\u0004\bB\u0010\tR$\u0010!\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010A\u001a\u0004\bC\u0010\t\"\u0004\bD\u0010ER$\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010A\u001a\u0004\bF\u0010\t\"\u0004\bG\u0010ER\u001c\u0010#\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010A\u001a\u0004\bH\u0010\tR\"\u0010$\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010A\u001a\u0004\bI\u0010\t\"\u0004\bJ\u0010ER\"\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010K\u001a\u0004\bL\u0010\u0010R\"\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010K\u001a\u0004\bM\u0010\u0010R\u001f\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010K\u001a\u0004\bN\u0010\u0010R\u001f\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010K\u001a\u0004\bO\u0010\u0010R\"\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010K\u001a\u0004\bP\u0010\u0010R\u001a\u0010*\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010A\u001a\u0004\bQ\u0010\tR\u001f\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010K\u001a\u0004\bR\u0010\u0010R\u001a\u0010,\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010S\u001a\u0004\bT\u0010\u0004R\u001c\u0010-\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010A\u001a\u0004\bU\u0010\tR\u001c\u0010.\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010V\u001a\u0004\bW\u0010\u001dR\u0019\u0010/\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010X\u001a\u0004\b/\u0010\u001f¨\u0006["}, d2 = {"Lcom/withings/insight/android/entity/Conversation;", "Landroid/os/Parcelable;", "", "hasNoNextDisplayActions", "()Z", "hasSuggestions", "requiresTextInput", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "", "component6", "()Ljava/util/List;", "Lcom/withings/insight/android/entity/Action;", "component7", "component8", "component9", "component10", "component11", "Lcom/withings/insight/android/entity/Suggestion;", "component12", "component13", "component14", "Lcom/withings/insight/android/entity/InputMetadata;", "component15", "()Lcom/withings/insight/android/entity/InputMetadata;", "component16", "()Ljava/lang/Boolean;", "messageId", "contentTitle", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "bubbleGlyph", "content", "onTapActions", "onTapActionsWithConditions", "actions", "onDisplayActions", "onDisplayActionsWithConditions", "messageType", UserResponseTypeHandler.TYPE_SUGGESTION, "expectUserResponse", RemoteMessageConst.INPUT_TYPE, "inputMetadata", "isEndMessage", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/withings/insight/android/entity/InputMetadata;Ljava/lang/Boolean;)Lcom/withings/insight/android/entity/Conversation;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessageId", "getContentTitle", "setContentTitle", "(Ljava/lang/String;)V", "getImage", "setImage", "getBubbleGlyph", "getContent", "setContent", "Ljava/util/List;", "getOnTapActions", "getOnTapActionsWithConditions", "getActions", "getOnDisplayActions", "getOnDisplayActionsWithConditions", "getMessageType", "getSuggestions", "Z", "getExpectUserResponse", "getInputType", "Lcom/withings/insight/android/entity/InputMetadata;", "getInputMetadata", "Ljava/lang/Boolean;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/lang/String;Lcom/withings/insight/android/entity/InputMetadata;Ljava/lang/Boolean;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Conversation implements Parcelable {
    public static final Parcelable.Creator<Conversation> CREATOR = new Creator();
    private final List<String> actions;
    @SerializedName("bubble_glyph")
    private final String bubbleGlyph;
    private String content;
    @SerializedName("content_title")
    private String contentTitle;
    @SerializedName("expected_user_response")
    private final boolean expectUserResponse;
    private String image;
    @SerializedName("input_metadata")
    private final InputMetadata inputMetadata;
    @SerializedName("input_type")
    private final String inputType;
    private final Boolean isEndMessage;
    @SerializedName(Constants.MessagePayloadKeys.MSGID_SERVER)
    private final String messageId;
    @SerializedName("message_type")
    private final String messageType;
    private final List<String> onDisplayActions;
    @SerializedName("conditionalOnDisplayActions")
    private final List<Action> onDisplayActionsWithConditions;
    @SerializedName("onTapActions")
    private final List<String> onTapActions;
    @SerializedName("conditionalOnTapActions")
    private final List<Action> onTapActionsWithConditions;
    private final List<Suggestion> suggestions;

    /* compiled from: Conversation.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Conversation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Conversation createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            u.j(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(Action.CREATOR.createFromParcel(parcel));
                }
            }
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList4.add(Action.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList4;
            }
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt3);
                for (int i13 = 0; i13 != readInt3; i13++) {
                    arrayList5.add(Suggestion.CREATOR.createFromParcel(parcel));
                }
                arrayList3 = arrayList5;
            }
            return new Conversation(readString, readString2, readString3, readString4, readString5, createStringArrayList, arrayList, createStringArrayList2, createStringArrayList3, arrayList2, readString6, arrayList3, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : InputMetadata.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Conversation[] newArray(int i11) {
            return new Conversation[i11];
        }
    }

    public Conversation(String messageId, String str, String str2, String str3, String content, List<String> list, List<Action> list2, List<String> list3, List<String> list4, List<Action> list5, String messageType, List<Suggestion> list6, boolean z5, String str4, InputMetadata inputMetadata, Boolean bool) {
        u.j(messageId, "messageId");
        u.j(content, "content");
        u.j(messageType, "messageType");
        this.messageId = messageId;
        this.contentTitle = str;
        this.image = str2;
        this.bubbleGlyph = str3;
        this.content = content;
        this.onTapActions = list;
        this.onTapActionsWithConditions = list2;
        this.actions = list3;
        this.onDisplayActions = list4;
        this.onDisplayActionsWithConditions = list5;
        this.messageType = messageType;
        this.suggestions = list6;
        this.expectUserResponse = z5;
        this.inputType = str4;
        this.inputMetadata = inputMetadata;
        this.isEndMessage = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, List list4, List list5, String str6, List list6, boolean z5, String str7, InputMetadata inputMetadata, Boolean bool, int i11, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        List<String> list7;
        List<Action> list8;
        List<String> list9;
        List<String> list10;
        List<Action> list11;
        String str13;
        List<Suggestion> list12;
        boolean z11;
        String str14;
        InputMetadata inputMetadata2;
        Boolean bool2;
        if ((i11 & 1) != 0) {
            str8 = conversation.messageId;
        } else {
            str8 = str;
        }
        if ((i11 & 2) != 0) {
            str9 = conversation.contentTitle;
        } else {
            str9 = str2;
        }
        if ((i11 & 4) != 0) {
            str10 = conversation.image;
        } else {
            str10 = str3;
        }
        if ((i11 & 8) != 0) {
            str11 = conversation.bubbleGlyph;
        } else {
            str11 = str4;
        }
        if ((i11 & 16) != 0) {
            str12 = conversation.content;
        } else {
            str12 = str5;
        }
        if ((i11 & 32) != 0) {
            list7 = conversation.onTapActions;
        } else {
            list7 = list;
        }
        if ((i11 & 64) != 0) {
            list8 = conversation.onTapActionsWithConditions;
        } else {
            list8 = list2;
        }
        if ((i11 & 128) != 0) {
            list9 = conversation.actions;
        } else {
            list9 = list3;
        }
        if ((i11 & 256) != 0) {
            list10 = conversation.onDisplayActions;
        } else {
            list10 = list4;
        }
        if ((i11 & 512) != 0) {
            list11 = conversation.onDisplayActionsWithConditions;
        } else {
            list11 = list5;
        }
        if ((i11 & 1024) != 0) {
            str13 = conversation.messageType;
        } else {
            str13 = str6;
        }
        if ((i11 & ModuleCopy.f28574b) != 0) {
            list12 = conversation.suggestions;
        } else {
            list12 = list6;
        }
        if ((i11 & 4096) != 0) {
            z11 = conversation.expectUserResponse;
        } else {
            z11 = z5;
        }
        if ((i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
            str14 = conversation.inputType;
        } else {
            str14 = str7;
        }
        String str15 = str14;
        if ((i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            inputMetadata2 = conversation.inputMetadata;
        } else {
            inputMetadata2 = inputMetadata;
        }
        if ((i11 & Utils.MAX_EVENT_SIZE) != 0) {
            bool2 = conversation.isEndMessage;
        } else {
            bool2 = bool;
        }
        return conversation.copy(str8, str9, str10, str11, str12, list7, list8, list9, list10, list11, str13, list12, z11, str15, inputMetadata2, bool2);
    }

    public final String component1() {
        return this.messageId;
    }

    public final List<Action> component10() {
        return this.onDisplayActionsWithConditions;
    }

    public final String component11() {
        return this.messageType;
    }

    public final List<Suggestion> component12() {
        return this.suggestions;
    }

    public final boolean component13() {
        return this.expectUserResponse;
    }

    public final String component14() {
        return this.inputType;
    }

    public final InputMetadata component15() {
        return this.inputMetadata;
    }

    public final Boolean component16() {
        return this.isEndMessage;
    }

    public final String component2() {
        return this.contentTitle;
    }

    public final String component3() {
        return this.image;
    }

    public final String component4() {
        return this.bubbleGlyph;
    }

    public final String component5() {
        return this.content;
    }

    public final List<String> component6() {
        return this.onTapActions;
    }

    public final List<Action> component7() {
        return this.onTapActionsWithConditions;
    }

    public final List<String> component8() {
        return this.actions;
    }

    public final List<String> component9() {
        return this.onDisplayActions;
    }

    public final Conversation copy(String messageId, String str, String str2, String str3, String content, List<String> list, List<Action> list2, List<String> list3, List<String> list4, List<Action> list5, String messageType, List<Suggestion> list6, boolean z5, String str4, InputMetadata inputMetadata, Boolean bool) {
        u.j(messageId, "messageId");
        u.j(content, "content");
        u.j(messageType, "messageType");
        return new Conversation(messageId, str, str2, str3, content, list, list2, list3, list4, list5, messageType, list6, z5, str4, inputMetadata, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) obj;
        if (u.e(this.messageId, conversation.messageId) && u.e(this.contentTitle, conversation.contentTitle) && u.e(this.image, conversation.image) && u.e(this.bubbleGlyph, conversation.bubbleGlyph) && u.e(this.content, conversation.content) && u.e(this.onTapActions, conversation.onTapActions) && u.e(this.onTapActionsWithConditions, conversation.onTapActionsWithConditions) && u.e(this.actions, conversation.actions) && u.e(this.onDisplayActions, conversation.onDisplayActions) && u.e(this.onDisplayActionsWithConditions, conversation.onDisplayActionsWithConditions) && u.e(this.messageType, conversation.messageType) && u.e(this.suggestions, conversation.suggestions) && this.expectUserResponse == conversation.expectUserResponse && u.e(this.inputType, conversation.inputType) && u.e(this.inputMetadata, conversation.inputMetadata) && u.e(this.isEndMessage, conversation.isEndMessage)) {
            return true;
        }
        return false;
    }

    public final List<String> getActions() {
        return this.actions;
    }

    public final String getBubbleGlyph() {
        return this.bubbleGlyph;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getContentTitle() {
        return this.contentTitle;
    }

    public final boolean getExpectUserResponse() {
        return this.expectUserResponse;
    }

    public final String getImage() {
        return this.image;
    }

    public final InputMetadata getInputMetadata() {
        return this.inputMetadata;
    }

    public final String getInputType() {
        return this.inputType;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getMessageType() {
        return this.messageType;
    }

    public final List<String> getOnDisplayActions() {
        return this.onDisplayActions;
    }

    public final List<Action> getOnDisplayActionsWithConditions() {
        return this.onDisplayActionsWithConditions;
    }

    public final List<String> getOnTapActions() {
        return this.onTapActions;
    }

    public final List<Action> getOnTapActionsWithConditions() {
        return this.onTapActionsWithConditions;
    }

    public final List<Suggestion> getSuggestions() {
        return this.suggestions;
    }

    public final boolean hasNoNextDisplayActions() {
        List<Action> list = this.onDisplayActionsWithConditions;
        Object obj = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (j.r(((Action) next).getAction(), "next", false)) {
                    obj = next;
                    break;
                }
            }
            if (obj == null) {
                return true;
            }
        } else {
            List<String> list2 = this.onDisplayActions;
            if (list2 == null) {
                return true;
            }
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (j.r((String) next2, "next", false)) {
                    obj = next2;
                    break;
                }
            }
            CharSequence charSequence = (CharSequence) obj;
            if (charSequence == null || charSequence.length() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasSuggestions() {
        List<Suggestion> suggestions;
        List<Suggestion> list = this.suggestions;
        if (list != null) {
            return true ^ list.isEmpty();
        }
        InputMetadata inputMetadata = this.inputMetadata;
        if (inputMetadata != null && (suggestions = inputMetadata.getSuggestions()) != null && !suggestions.isEmpty()) {
            return true;
        }
        return false;
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
        int hashCode12 = this.messageId.hashCode() * 31;
        String str = this.contentTitle;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode12 + hashCode) * 31;
        String str2 = this.image;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str3 = this.bubbleGlyph;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int c11 = d.c(this.content, (i13 + hashCode3) * 31, 31);
        List<String> list = this.onTapActions;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i14 = (c11 + hashCode4) * 31;
        List<Action> list2 = this.onTapActionsWithConditions;
        if (list2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list2.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        List<String> list3 = this.actions;
        if (list3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list3.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        List<String> list4 = this.onDisplayActions;
        if (list4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list4.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        List<Action> list5 = this.onDisplayActionsWithConditions;
        if (list5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list5.hashCode();
        }
        int c12 = d.c(this.messageType, (i17 + hashCode8) * 31, 31);
        List<Suggestion> list6 = this.suggestions;
        if (list6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list6.hashCode();
        }
        int a11 = y1.a(this.expectUserResponse, (c12 + hashCode9) * 31, 31);
        String str4 = this.inputType;
        if (str4 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str4.hashCode();
        }
        int i18 = (a11 + hashCode10) * 31;
        InputMetadata inputMetadata = this.inputMetadata;
        if (inputMetadata == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = inputMetadata.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        Boolean bool = this.isEndMessage;
        if (bool != null) {
            i11 = bool.hashCode();
        }
        return i19 + i11;
    }

    public final Boolean isEndMessage() {
        return this.isEndMessage;
    }

    public final boolean requiresTextInput() {
        if (!u.e(this.inputType, "text") && !u.e(this.inputType, UserResponseTypeHandler.TYPE_PICKER)) {
            return false;
        }
        return true;
    }

    public final void setContent(String str) {
        u.j(str, "<set-?>");
        this.content = str;
    }

    public final void setContentTitle(String str) {
        this.contentTitle = str;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public String toString() {
        String str = this.messageId;
        String str2 = this.contentTitle;
        String str3 = this.image;
        String str4 = this.bubbleGlyph;
        String str5 = this.content;
        List<String> list = this.onTapActions;
        List<Action> list2 = this.onTapActionsWithConditions;
        List<String> list3 = this.actions;
        List<String> list4 = this.onDisplayActions;
        List<Action> list5 = this.onDisplayActionsWithConditions;
        String str6 = this.messageType;
        List<Suggestion> list6 = this.suggestions;
        boolean z5 = this.expectUserResponse;
        String str7 = this.inputType;
        InputMetadata inputMetadata = this.inputMetadata;
        Boolean bool = this.isEndMessage;
        StringBuilder b10 = l0.b("Conversation(messageId=", str, ", contentTitle=", str2, ", image=");
        b.d(b10, str3, ", bubbleGlyph=", str4, ", content=");
        c.d(b10, str5, ", onTapActions=", list, ", onTapActionsWithConditions=");
        a.a(b10, list2, ", actions=", list3, ", onDisplayActions=");
        a.a(b10, list4, ", onDisplayActionsWithConditions=", list5, ", messageType=");
        c.d(b10, str6, ", suggestions=", list6, ", expectUserResponse=");
        b10.append(z5);
        b10.append(", inputType=");
        b10.append(str7);
        b10.append(", inputMetadata=");
        b10.append(inputMetadata);
        b10.append(", isEndMessage=");
        b10.append(bool);
        b10.append(")");
        return b10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.messageId);
        out.writeString(this.contentTitle);
        out.writeString(this.image);
        out.writeString(this.bubbleGlyph);
        out.writeString(this.content);
        out.writeStringList(this.onTapActions);
        List<Action> list = this.onTapActionsWithConditions;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (Action action : list) {
                action.writeToParcel(out, i11);
            }
        }
        out.writeStringList(this.actions);
        out.writeStringList(this.onDisplayActions);
        List<Action> list2 = this.onDisplayActionsWithConditions;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            for (Action action2 : list2) {
                action2.writeToParcel(out, i11);
            }
        }
        out.writeString(this.messageType);
        List<Suggestion> list3 = this.suggestions;
        if (list3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list3.size());
            for (Suggestion suggestion : list3) {
                suggestion.writeToParcel(out, i11);
            }
        }
        out.writeInt(this.expectUserResponse ? 1 : 0);
        out.writeString(this.inputType);
        InputMetadata inputMetadata = this.inputMetadata;
        if (inputMetadata == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            inputMetadata.writeToParcel(out, i11);
        }
        Boolean bool = this.isEndMessage;
        if (bool == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public /* synthetic */ Conversation(String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, List list4, List list5, String str6, List list6, boolean z5, String str7, InputMetadata inputMetadata, Boolean bool, int i11, m mVar) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, str5, list, list2, (i11 & 128) != 0 ? null : list3, (i11 & 256) != 0 ? null : list4, list5, str6, list6, z5, str7, inputMetadata, (i11 & Utils.MAX_EVENT_SIZE) != 0 ? Boolean.FALSE : bool);
    }
}
