package com.withings.insight.android.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.c;
import androidx.camera.core.y1;
import androidx.work.impl.g;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import hn.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import og.y;
import okhttp3.internal.http2.Http2;
import org.joda.time.DateTime;
/* compiled from: Insight.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b@\b\u0087\b\u0018\u00002\u00020\u0001B»\u0002\u0012\u0006\u00100\u001a\u00020\u0007\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n\u0012\u0006\u00103\u001a\u00020\n\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u00107\u001a\u00020\u0007\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0019\u0012\u0010\b\u0003\u0010;\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c\u0012\b\b\u0002\u0010<\u001a\u00020\u0002\u0012\u0016\b\u0003\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!\u0012\u0016\b\u0003\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!\u0012\b\b\u0002\u0010?\u001a\u00020\u0002\u0012\b\b\u0002\u0010@\u001a\u00020\u0002\u0012\b\b\u0002\u0010A\u001a\u00020\n\u0012\b\b\u0002\u0010B\u001a\u00020\n\u0012\b\b\u0002\u0010C\u001a\u00020\u0002\u0012\u0016\b\u0003\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010-¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\tJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\tJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\tJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0004J\u001e\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u001e\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0004J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0004J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010\u000fJ\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b(\u0010\u000fJ\u0010\u0010)\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u0004J\u001e\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!HÆ\u0003¢\u0006\u0004\b*\u0010#J\u0012\u0010+\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b+\u0010\u0016J\u0012\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b,\u0010\fJ\u0012\u0010.\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0004\b.\u0010/JÈ\u0002\u0010H\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020\u00072\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n2\b\b\u0002\u00103\u001a\u00020\n2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u00107\u001a\u00020\u00072\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00192\u0010\b\u0003\u0010;\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\b\b\u0002\u0010<\u001a\u00020\u00022\u0016\b\u0003\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!2\u0016\b\u0003\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!2\b\b\u0002\u0010?\u001a\u00020\u00022\b\b\u0002\u0010@\u001a\u00020\u00022\b\b\u0002\u0010A\u001a\u00020\n2\b\b\u0002\u0010B\u001a\u00020\n2\b\b\u0002\u0010C\u001a\u00020\u00022\u0016\b\u0003\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010-HÆ\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bJ\u0010\tJ\u0010\u0010K\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bK\u0010LJ\u001a\u0010O\u001a\u00020\u00022\b\u0010N\u001a\u0004\u0018\u00010MHÖ\u0003¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bQ\u0010LJ \u0010V\u001a\u00020U2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\bV\u0010WR\u001a\u00100\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010X\u001a\u0004\bY\u0010\tR$\u00101\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010Z\u001a\u0004\b[\u0010\f\"\u0004\b\\\u0010]R\u001c\u00102\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010Z\u001a\u0004\b^\u0010\fR\"\u00103\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010_\u001a\u0004\b`\u0010\u000f\"\u0004\ba\u0010bR\u0019\u00104\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b4\u0010X\u001a\u0004\bc\u0010\tR\u0019\u00105\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b5\u0010X\u001a\u0004\bd\u0010\tR\u0019\u00106\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b6\u0010X\u001a\u0004\be\u0010\tR\u0017\u00107\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b7\u0010X\u001a\u0004\bf\u0010\tR$\u00108\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010g\u001a\u0004\bh\u0010\u0016\"\u0004\bi\u0010jR$\u00109\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010k\u001a\u0004\bl\u0010\u0018\"\u0004\bm\u0010nR\u001c\u0010:\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010o\u001a\u0004\bp\u0010\u001bR*\u0010;\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010q\u001a\u0004\br\u0010\u001f\"\u0004\bs\u0010tR\"\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010u\u001a\u0004\bv\u0010\u0004\"\u0004\bw\u0010xR0\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010y\u001a\u0004\bz\u0010#\"\u0004\b{\u0010|R0\u0010>\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010y\u001a\u0004\b}\u0010#\"\u0004\b~\u0010|R#\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b?\u0010u\u001a\u0004\b\u007f\u0010\u0004\"\u0005\b\u0080\u0001\u0010xR$\u0010@\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b@\u0010u\u001a\u0005\b\u0081\u0001\u0010\u0004\"\u0005\b\u0082\u0001\u0010xR$\u0010A\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bA\u0010_\u001a\u0005\b\u0083\u0001\u0010\u000f\"\u0005\b\u0084\u0001\u0010bR$\u0010B\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bB\u0010_\u001a\u0005\b\u0085\u0001\u0010\u000f\"\u0005\b\u0086\u0001\u0010bR$\u0010C\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bC\u0010u\u001a\u0005\b\u0087\u0001\u0010\u0004\"\u0005\b\u0088\u0001\u0010xR2\u0010D\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bD\u0010y\u001a\u0005\b\u0089\u0001\u0010#\"\u0005\b\u008a\u0001\u0010|R&\u0010E\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bE\u0010g\u001a\u0005\b\u008b\u0001\u0010\u0016\"\u0005\b\u008c\u0001\u0010jR&\u0010F\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bF\u0010Z\u001a\u0005\b\u008d\u0001\u0010\f\"\u0005\b\u008e\u0001\u0010]R(\u0010G\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bG\u0010\u008f\u0001\u001a\u0005\b\u0090\u0001\u0010/\"\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0095\u0001"}, d2 = {"Lcom/withings/insight/android/entity/Insight;", "Landroid/os/Parcelable;", "", "isToday", "()Z", "hasValidId", "isVersionSupported", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/lang/Long;", "component3", "component4", "()J", "component5", "component6", "component7", "component8", "", "component9", "()Ljava/lang/Integer;", "component10", "()Ljava/lang/Boolean;", "Lcom/withings/insight/android/entity/InsightContent;", "component11", "()Lcom/withings/insight/android/entity/InsightContent;", "", "Lcom/withings/insight/android/entity/SelectedExchange;", "component12", "()Ljava/util/List;", "component13", "", "component14", "()Ljava/util/Map;", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "", "component24", "()Ljava/lang/Float;", "crmId", "conversationId", "insightId", NavigationArguments.USER_ID, WsVasistasSerie.KEY_FORMAT, "emotion", "bgcolor", "category", FoodDayFragment.ARG_DAY, "archivable", "content", "scenario", "synced", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "variables", "read", "opened", "modified", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "deleted", "conditions", RemoteMessageConst.Notification.PRIORITY, "expirationDate", "version", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/withings/insight/android/entity/InsightContent;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;ZZJJZLjava/util/Map;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Float;)Lcom/withings/insight/android/entity/Insight;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCrmId", "Ljava/lang/Long;", "getConversationId", "setConversationId", "(Ljava/lang/Long;)V", "getInsightId", "J", "getUserId", "setUserId", "(J)V", "getFormat", "getEmotion", "getBgcolor", "getCategory", "Ljava/lang/Integer;", "getDay", "setDay", "(Ljava/lang/Integer;)V", "Ljava/lang/Boolean;", "getArchivable", "setArchivable", "(Ljava/lang/Boolean;)V", "Lcom/withings/insight/android/entity/InsightContent;", "getContent", "Ljava/util/List;", "getScenario", "setScenario", "(Ljava/util/List;)V", "Z", "getSynced", "setSynced", "(Z)V", "Ljava/util/Map;", "getContext", "setContext", "(Ljava/util/Map;)V", "getVariables", "setVariables", "getRead", "setRead", "getOpened", "setOpened", "getModified", "setModified", "getCreated", "setCreated", "getDeleted", "setDeleted", "getConditions", "setConditions", "getPriority", "setPriority", "getExpirationDate", "setExpirationDate", "Ljava/lang/Float;", "getVersion", "setVersion", "(Ljava/lang/Float;)V", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/withings/insight/android/entity/InsightContent;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;ZZJJZLjava/util/Map;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Float;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Insight implements Parcelable {
    public static final Parcelable.Creator<Insight> CREATOR = new Creator();
    private Boolean archivable;
    private final String bgcolor;
    private final String category;
    private Map<String, String> conditions;
    private final InsightContent content;
    private Map<String, String> context;
    private Long conversationId;
    private long created;
    @SerializedName("crmid")
    private final String crmId;
    private Integer day;
    private boolean deleted;
    private final String emotion;
    private Long expirationDate;
    private final String format;
    @SerializedName("id")
    private final Long insightId;
    private long modified;
    private boolean opened;
    private Integer priority;
    private boolean read;
    private List<SelectedExchange> scenario;
    private boolean synced;
    private long userId;
    private Map<String, String> variables;
    private Float version;

    /* compiled from: Insight.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Insight> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Insight createFromParcel(Parcel parcel) {
            Boolean valueOf;
            ArrayList arrayList;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            LinkedHashMap linkedHashMap4;
            LinkedHashMap linkedHashMap5;
            u.j(parcel, "parcel");
            String readString = parcel.readString();
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            long readLong = parcel.readLong();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            InsightContent createFromParcel = parcel.readInt() == 0 ? null : InsightContent.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    arrayList2.add(SelectedExchange.CREATOR.createFromParcel(parcel));
                    i11++;
                    readInt = readInt;
                }
                arrayList = arrayList2;
            }
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    linkedHashMap6.put(parcel.readString(), parcel.readString());
                    i12++;
                    readInt2 = readInt2;
                }
                linkedHashMap = linkedHashMap6;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = linkedHashMap;
                linkedHashMap3 = null;
            } else {
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(readInt3);
                int i13 = 0;
                while (i13 != readInt3) {
                    linkedHashMap7.put(parcel.readString(), parcel.readString());
                    i13++;
                    readInt3 = readInt3;
                    linkedHashMap = linkedHashMap;
                }
                linkedHashMap2 = linkedHashMap;
                linkedHashMap3 = linkedHashMap7;
            }
            boolean z11 = parcel.readInt() != 0;
            boolean z12 = parcel.readInt() != 0;
            long readLong2 = parcel.readLong();
            long readLong3 = parcel.readLong();
            boolean z13 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap4 = linkedHashMap3;
                linkedHashMap5 = null;
            } else {
                int readInt4 = parcel.readInt();
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(readInt4);
                int i14 = 0;
                while (i14 != readInt4) {
                    linkedHashMap8.put(parcel.readString(), parcel.readString());
                    i14++;
                    readInt4 = readInt4;
                    linkedHashMap3 = linkedHashMap3;
                }
                linkedHashMap4 = linkedHashMap3;
                linkedHashMap5 = linkedHashMap8;
            }
            return new Insight(readString, valueOf2, valueOf3, readLong, readString2, readString3, readString4, readString5, valueOf4, valueOf, createFromParcel, arrayList, z5, linkedHashMap2, linkedHashMap4, z11, z12, readLong2, readLong3, z13, linkedHashMap5, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Insight[] newArray(int i11) {
            return new Insight[i11];
        }
    }

    public Insight(String crmId, Long l5, Long l6, long j5, String str, String str2, String str3, String category, Integer num, Boolean bool, InsightContent insightContent, List<SelectedExchange> list, boolean z5, Map<String, String> map, Map<String, String> map2, boolean z11, boolean z12, long j11, long j12, boolean z13, Map<String, String> map3, Integer num2, Long l11, Float f11) {
        u.j(crmId, "crmId");
        u.j(category, "category");
        this.crmId = crmId;
        this.conversationId = l5;
        this.insightId = l6;
        this.userId = j5;
        this.format = str;
        this.emotion = str2;
        this.bgcolor = str3;
        this.category = category;
        this.day = num;
        this.archivable = bool;
        this.content = insightContent;
        this.scenario = list;
        this.synced = z5;
        this.context = map;
        this.variables = map2;
        this.read = z11;
        this.opened = z12;
        this.modified = j11;
        this.created = j12;
        this.deleted = z13;
        this.conditions = map3;
        this.priority = num2;
        this.expirationDate = l11;
        this.version = f11;
    }

    public final String component1() {
        return this.crmId;
    }

    public final Boolean component10() {
        return this.archivable;
    }

    public final InsightContent component11() {
        return this.content;
    }

    public final List<SelectedExchange> component12() {
        return this.scenario;
    }

    public final boolean component13() {
        return this.synced;
    }

    public final Map<String, String> component14() {
        return this.context;
    }

    public final Map<String, String> component15() {
        return this.variables;
    }

    public final boolean component16() {
        return this.read;
    }

    public final boolean component17() {
        return this.opened;
    }

    public final long component18() {
        return this.modified;
    }

    public final long component19() {
        return this.created;
    }

    public final Long component2() {
        return this.conversationId;
    }

    public final boolean component20() {
        return this.deleted;
    }

    public final Map<String, String> component21() {
        return this.conditions;
    }

    public final Integer component22() {
        return this.priority;
    }

    public final Long component23() {
        return this.expirationDate;
    }

    public final Float component24() {
        return this.version;
    }

    public final Long component3() {
        return this.insightId;
    }

    public final long component4() {
        return this.userId;
    }

    public final String component5() {
        return this.format;
    }

    public final String component6() {
        return this.emotion;
    }

    public final String component7() {
        return this.bgcolor;
    }

    public final String component8() {
        return this.category;
    }

    public final Integer component9() {
        return this.day;
    }

    public final Insight copy(String crmId, Long l5, Long l6, long j5, String str, String str2, String str3, String category, Integer num, Boolean bool, InsightContent insightContent, List<SelectedExchange> list, boolean z5, Map<String, String> map, Map<String, String> map2, boolean z11, boolean z12, long j11, long j12, boolean z13, Map<String, String> map3, Integer num2, Long l11, Float f11) {
        u.j(crmId, "crmId");
        u.j(category, "category");
        return new Insight(crmId, l5, l6, j5, str, str2, str3, category, num, bool, insightContent, list, z5, map, map2, z11, z12, j11, j12, z13, map3, num2, l11, f11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Insight)) {
            return false;
        }
        Insight insight = (Insight) obj;
        if (u.e(this.crmId, insight.crmId) && u.e(this.conversationId, insight.conversationId) && u.e(this.insightId, insight.insightId) && this.userId == insight.userId && u.e(this.format, insight.format) && u.e(this.emotion, insight.emotion) && u.e(this.bgcolor, insight.bgcolor) && u.e(this.category, insight.category) && u.e(this.day, insight.day) && u.e(this.archivable, insight.archivable) && u.e(this.content, insight.content) && u.e(this.scenario, insight.scenario) && this.synced == insight.synced && u.e(this.context, insight.context) && u.e(this.variables, insight.variables) && this.read == insight.read && this.opened == insight.opened && this.modified == insight.modified && this.created == insight.created && this.deleted == insight.deleted && u.e(this.conditions, insight.conditions) && u.e(this.priority, insight.priority) && u.e(this.expirationDate, insight.expirationDate) && u.e(this.version, insight.version)) {
            return true;
        }
        return false;
    }

    public final Boolean getArchivable() {
        return this.archivable;
    }

    public final String getBgcolor() {
        return this.bgcolor;
    }

    public final String getCategory() {
        return this.category;
    }

    public final Map<String, String> getConditions() {
        return this.conditions;
    }

    public final InsightContent getContent() {
        return this.content;
    }

    public final Map<String, String> getContext() {
        return this.context;
    }

    public final Long getConversationId() {
        return this.conversationId;
    }

    public final long getCreated() {
        return this.created;
    }

    public final String getCrmId() {
        return this.crmId;
    }

    public final Integer getDay() {
        return this.day;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public final String getEmotion() {
        return this.emotion;
    }

    public final Long getExpirationDate() {
        return this.expirationDate;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Long getInsightId() {
        return this.insightId;
    }

    public final long getModified() {
        return this.modified;
    }

    public final boolean getOpened() {
        return this.opened;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final List<SelectedExchange> getScenario() {
        return this.scenario;
    }

    public final boolean getSynced() {
        return this.synced;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final Map<String, String> getVariables() {
        return this.variables;
    }

    public final Float getVersion() {
        return this.version;
    }

    public final boolean hasValidId() {
        Long l5 = this.insightId;
        if (l5 != null && l5.longValue() > 0) {
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
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15 = this.crmId.hashCode() * 31;
        Long l5 = this.conversationId;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (hashCode15 + hashCode) * 31;
        Long l6 = this.insightId;
        if (l6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l6.hashCode();
        }
        int a11 = c.a(this.userId, (i12 + hashCode2) * 31, 31);
        String str = this.format;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i13 = (a11 + hashCode3) * 31;
        String str2 = this.emotion;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str3 = this.bgcolor;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int c11 = d.c(this.category, (i14 + hashCode5) * 31, 31);
        Integer num = this.day;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i15 = (c11 + hashCode6) * 31;
        Boolean bool = this.archivable;
        if (bool == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = bool.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        InsightContent insightContent = this.content;
        if (insightContent == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = insightContent.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        List<SelectedExchange> list = this.scenario;
        if (list == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list.hashCode();
        }
        int a12 = y1.a(this.synced, (i17 + hashCode9) * 31, 31);
        Map<String, String> map = this.context;
        if (map == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = map.hashCode();
        }
        int i18 = (a12 + hashCode10) * 31;
        Map<String, String> map2 = this.variables;
        if (map2 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = map2.hashCode();
        }
        int a13 = y1.a(this.deleted, c.a(this.created, c.a(this.modified, y1.a(this.opened, y1.a(this.read, (i18 + hashCode11) * 31, 31), 31), 31), 31), 31);
        Map<String, String> map3 = this.conditions;
        if (map3 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = map3.hashCode();
        }
        int i19 = (a13 + hashCode12) * 31;
        Integer num2 = this.priority;
        if (num2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num2.hashCode();
        }
        int i21 = (i19 + hashCode13) * 31;
        Long l11 = this.expirationDate;
        if (l11 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = l11.hashCode();
        }
        int i22 = (i21 + hashCode14) * 31;
        Float f11 = this.version;
        if (f11 != null) {
            i11 = f11.hashCode();
        }
        return i22 + i11;
    }

    public final boolean isToday() {
        return a.g(new DateTime(this.created));
    }

    public final boolean isVersionSupported() {
        Float f11 = this.version;
        if (f11 == null || f11.floatValue() <= 1.0d) {
            return true;
        }
        return false;
    }

    public final void setArchivable(Boolean bool) {
        this.archivable = bool;
    }

    public final void setConditions(Map<String, String> map) {
        this.conditions = map;
    }

    public final void setContext(Map<String, String> map) {
        this.context = map;
    }

    public final void setConversationId(Long l5) {
        this.conversationId = l5;
    }

    public final void setCreated(long j5) {
        this.created = j5;
    }

    public final void setDay(Integer num) {
        this.day = num;
    }

    public final void setDeleted(boolean z5) {
        this.deleted = z5;
    }

    public final void setExpirationDate(Long l5) {
        this.expirationDate = l5;
    }

    public final void setModified(long j5) {
        this.modified = j5;
    }

    public final void setOpened(boolean z5) {
        this.opened = z5;
    }

    public final void setPriority(Integer num) {
        this.priority = num;
    }

    public final void setRead(boolean z5) {
        this.read = z5;
    }

    public final void setScenario(List<SelectedExchange> list) {
        this.scenario = list;
    }

    public final void setSynced(boolean z5) {
        this.synced = z5;
    }

    public final void setUserId(long j5) {
        this.userId = j5;
    }

    public final void setVariables(Map<String, String> map) {
        this.variables = map;
    }

    public final void setVersion(Float f11) {
        this.version = f11;
    }

    public String toString() {
        String str = this.crmId;
        Long l5 = this.conversationId;
        Long l6 = this.insightId;
        long j5 = this.userId;
        String str2 = this.format;
        String str3 = this.emotion;
        String str4 = this.bgcolor;
        String str5 = this.category;
        Integer num = this.day;
        Boolean bool = this.archivable;
        InsightContent insightContent = this.content;
        List<SelectedExchange> list = this.scenario;
        boolean z5 = this.synced;
        Map<String, String> map = this.context;
        Map<String, String> map2 = this.variables;
        boolean z11 = this.read;
        boolean z12 = this.opened;
        long j11 = this.modified;
        long j12 = this.created;
        boolean z13 = this.deleted;
        Map<String, String> map3 = this.conditions;
        Integer num2 = this.priority;
        Long l11 = this.expirationDate;
        Float f11 = this.version;
        StringBuilder sb2 = new StringBuilder("Insight(crmId=");
        sb2.append(str);
        sb2.append(", conversationId=");
        sb2.append(l5);
        sb2.append(", insightId=");
        sb2.append(l6);
        sb2.append(", userId=");
        sb2.append(j5);
        b.d(sb2, ", format=", str2, ", emotion=", str3);
        b.d(sb2, ", bgcolor=", str4, ", category=", str5);
        sb2.append(", day=");
        sb2.append(num);
        sb2.append(", archivable=");
        sb2.append(bool);
        sb2.append(", content=");
        sb2.append(insightContent);
        sb2.append(", scenario=");
        sb2.append(list);
        sb2.append(", synced=");
        sb2.append(z5);
        sb2.append(", context=");
        sb2.append(map);
        sb2.append(", variables=");
        sb2.append(map2);
        sb2.append(", read=");
        sb2.append(z11);
        sb2.append(", opened=");
        sb2.append(z12);
        sb2.append(", modified=");
        sb2.append(j11);
        g.d(sb2, ", created=", j12, ", deleted=");
        sb2.append(z13);
        sb2.append(", conditions=");
        sb2.append(map3);
        sb2.append(", priority=");
        sb2.append(num2);
        sb2.append(", expirationDate=");
        sb2.append(l11);
        sb2.append(", version=");
        sb2.append(f11);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.crmId);
        Long l5 = this.conversationId;
        if (l5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l5.longValue());
        }
        Long l6 = this.insightId;
        if (l6 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l6.longValue());
        }
        out.writeLong(this.userId);
        out.writeString(this.format);
        out.writeString(this.emotion);
        out.writeString(this.bgcolor);
        out.writeString(this.category);
        Integer num = this.day;
        if (num == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num);
        }
        Boolean bool = this.archivable;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        InsightContent insightContent = this.content;
        if (insightContent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            insightContent.writeToParcel(out, i11);
        }
        List<SelectedExchange> list = this.scenario;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (SelectedExchange selectedExchange : list) {
                selectedExchange.writeToParcel(out, i11);
            }
        }
        out.writeInt(this.synced ? 1 : 0);
        Map<String, String> map = this.context;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        Map<String, String> map2 = this.variables;
        if (map2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                out.writeString(entry2.getKey());
                out.writeString(entry2.getValue());
            }
        }
        out.writeInt(this.read ? 1 : 0);
        out.writeInt(this.opened ? 1 : 0);
        out.writeLong(this.modified);
        out.writeLong(this.created);
        out.writeInt(this.deleted ? 1 : 0);
        Map<String, String> map3 = this.conditions;
        if (map3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map3.size());
            for (Map.Entry<String, String> entry3 : map3.entrySet()) {
                out.writeString(entry3.getKey());
                out.writeString(entry3.getValue());
            }
        }
        Integer num2 = this.priority;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            y.b(out, 1, num2);
        }
        Long l11 = this.expirationDate;
        if (l11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l11.longValue());
        }
        Float f11 = this.version;
        if (f11 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeFloat(f11.floatValue());
    }

    public /* synthetic */ Insight(String str, Long l5, Long l6, long j5, String str2, String str3, String str4, String str5, Integer num, Boolean bool, InsightContent insightContent, List list, boolean z5, Map map, Map map2, boolean z11, boolean z12, long j11, long j12, boolean z13, Map map3, Integer num2, Long l11, Float f11, int i11, m mVar) {
        this(str, (i11 & 2) != 0 ? null : l5, (i11 & 4) != 0 ? 0L : l6, j5, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, str5, (i11 & 256) != 0 ? null : num, (i11 & 512) != 0 ? null : bool, (i11 & 1024) != 0 ? null : insightContent, (i11 & ModuleCopy.f28574b) != 0 ? null : list, (i11 & 4096) != 0 ? true : z5, (i11 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : map, (i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : map2, (32768 & i11) != 0 ? false : z11, (65536 & i11) != 0 ? false : z12, (131072 & i11) != 0 ? 0L : j11, (262144 & i11) != 0 ? 0L : j12, (524288 & i11) != 0 ? false : z13, (1048576 & i11) != 0 ? null : map3, (2097152 & i11) != 0 ? null : num2, (4194304 & i11) != 0 ? null : l11, (i11 & 8388608) != 0 ? Float.valueOf(0.0f) : f11);
    }
}
