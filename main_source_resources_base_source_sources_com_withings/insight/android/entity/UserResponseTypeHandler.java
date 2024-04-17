package com.withings.insight.android.entity;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.webservices.legacy.withings.model.timeline.ConversationItemData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: UserResponseTypeHandler.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/withings/insight/android/entity/UserResponseTypeHandler;", "", "Lcom/withings/insight/android/entity/Conversation;", ConversationItemData.WS_TYPE, "Lnm0/y;", "getUserResponse", "(Lcom/withings/insight/android/entity/Conversation;)V", "Lcom/withings/insight/android/entity/UserResponseTypeHandler$UserResponseListener;", "userResponseListener", "Lcom/withings/insight/android/entity/UserResponseTypeHandler$UserResponseListener;", "<init>", "(Lcom/withings/insight/android/entity/UserResponseTypeHandler$UserResponseListener;)V", "Companion", "UserResponseListener", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class UserResponseTypeHandler {
    public static final Companion Companion = new Companion(null);
    public static final String KEYBOARD_TYPE_DEFAULT = "default";
    public static final String KEYBOARD_TYPE_EMAIL = "email";
    public static final String KEYBOARD_TYPE_NUMBER = "number";
    public static final String KEYBOARD_TYPE_NUMBER_AND_PUNCTUATION = "number_and_punctuation";
    public static final String KEYBOARD_TYPE_PASSWORD = "password";
    public static final String KEYBOARD_TYPE_PHONE = "phone";
    public static final String KEYBOARD_TYPE_URL = "url";
    public static final String MODE_DATE = "date";
    public static final String MODE_DATE_AND_TIME = "date_and_time";
    public static final String MODE_TIME = "time";
    public static final String SINGLE_CHOICE_SELECTION = "single_choice";
    public static final String STYLE_DATE = "date";
    public static final String TYPE_PICKER = "picker";
    public static final String TYPE_SUGGESTION = "suggestions";
    public static final String TYPE_TEXT = "text";
    private final UserResponseListener userResponseListener;

    /* compiled from: UserResponseTypeHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/withings/insight/android/entity/UserResponseTypeHandler$Companion;", "", "()V", "KEYBOARD_TYPE_DEFAULT", "", "KEYBOARD_TYPE_EMAIL", "KEYBOARD_TYPE_NUMBER", "KEYBOARD_TYPE_NUMBER_AND_PUNCTUATION", "KEYBOARD_TYPE_PASSWORD", "KEYBOARD_TYPE_PHONE", "KEYBOARD_TYPE_URL", "MODE_DATE", "MODE_DATE_AND_TIME", "MODE_TIME", "SINGLE_CHOICE_SELECTION", "STYLE_DATE", "TYPE_PICKER", "TYPE_SUGGESTION", "TYPE_TEXT", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: UserResponseTypeHandler.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0010¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/withings/insight/android/entity/UserResponseTypeHandler$UserResponseListener;", "", "Lcom/withings/insight/android/entity/Conversation;", ConversationItemData.WS_TYPE, "", "", RemoteMessageConst.INPUT_TYPE, "Lnm0/y;", "onTextInputRequired", "(Lcom/withings/insight/android/entity/Conversation;Ljava/util/List;)V", "Lcom/withings/insight/android/entity/Suggestion;", UserResponseTypeHandler.TYPE_SUGGESTION, "onSingleSuggestionSelectionRequired", "(Ljava/util/List;Lcom/withings/insight/android/entity/Conversation;)V", "onMultipleSuggestionSelectionRequired", "onDatePickerInputRequired", "(Lcom/withings/insight/android/entity/Conversation;)V", "onTimePickerInputRequired", "onDateTimePickerInputRequired", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface UserResponseListener {
        void onDatePickerInputRequired(Conversation conversation);

        void onDateTimePickerInputRequired(Conversation conversation);

        void onMultipleSuggestionSelectionRequired(List<Suggestion> list, Conversation conversation);

        void onSingleSuggestionSelectionRequired(List<Suggestion> list, Conversation conversation);

        void onTextInputRequired(Conversation conversation, List<Integer> list);

        void onTimePickerInputRequired(Conversation conversation);
    }

    public UserResponseTypeHandler(UserResponseListener userResponseListener) {
        u.j(userResponseListener, "userResponseListener");
        this.userResponseListener = userResponseListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x010c, code lost:
        if (r2.equals("default") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0133, code lost:
        if (r2.equals("phone") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0158, code lost:
        if (r2.equals("url") == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015b, code lost:
        r1 = kotlin.collections.x.V(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016a, code lost:
        if (r2.equals(com.withings.insight.android.entity.UserResponseTypeHandler.KEYBOARD_TYPE_NUMBER) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016d, code lost:
        r1 = kotlin.collections.x.V(2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void getUserResponse(com.withings.insight.android.entity.Conversation r6) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.insight.android.entity.UserResponseTypeHandler.getUserResponse(com.withings.insight.android.entity.Conversation):void");
    }
}
