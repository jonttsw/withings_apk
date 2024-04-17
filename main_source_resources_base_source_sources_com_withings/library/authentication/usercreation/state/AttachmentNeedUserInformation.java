package com.withings.library.authentication.usercreation.state;

import a0.a;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import com.withings.library.authentication.attachment.state.AttachmentState;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qm0.d;
/* compiled from: AttachmentNeedUserInformation.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0002\n\u000bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/withings/library/authentication/usercreation/state/AttachmentNeedUserInformation;", "Lcom/withings/library/authentication/attachment/state/AttachmentState;", "Lcom/withings/library/authentication/usercreation/state/AttachmentNeedUserInformation$UserInformation;", "userInformation", "Lcom/withings/library/authentication/usercreation/state/AttachmentNeedUserInformation$OutputState;", "confirmNewUserInformation", "(Lcom/withings/library/authentication/usercreation/state/AttachmentNeedUserInformation$UserInformation;Lqm0/d;)Ljava/lang/Object;", "getCurrentUserInformation", "()Lcom/withings/library/authentication/usercreation/state/AttachmentNeedUserInformation$UserInformation;", "currentUserInformation", "OutputState", "UserInformation", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface AttachmentNeedUserInformation extends AttachmentState {

    /* compiled from: AttachmentNeedUserInformation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bv\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/library/authentication/usercreation/state/AttachmentNeedUserInformation$OutputState;", "", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface OutputState {
    }

    /* compiled from: AttachmentNeedUserInformation.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/withings/library/authentication/usercreation/state/AttachmentNeedUserInformation$UserInformation;", "", "firstName", "", "lastName", "mail", "birthday", "biologicalSex", "height", "", "weight", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IF)V", "getBiologicalSex", "()Ljava/lang/String;", "getBirthday", "getFirstName", "getHeight", "()I", "getLastName", "getMail", "getWeight", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UserInformation {
        private final String biologicalSex;
        private final String birthday;
        private final String firstName;
        private final int height;
        private final String lastName;
        private final String mail;
        private final float weight;

        public UserInformation(String firstName, String lastName, String mail, String birthday, String biologicalSex, int i11, float f11) {
            u.j(firstName, "firstName");
            u.j(lastName, "lastName");
            u.j(mail, "mail");
            u.j(birthday, "birthday");
            u.j(biologicalSex, "biologicalSex");
            this.firstName = firstName;
            this.lastName = lastName;
            this.mail = mail;
            this.birthday = birthday;
            this.biologicalSex = biologicalSex;
            this.height = i11;
            this.weight = f11;
        }

        public static /* synthetic */ UserInformation copy$default(UserInformation userInformation, String str, String str2, String str3, String str4, String str5, int i11, float f11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = userInformation.firstName;
            }
            if ((i12 & 2) != 0) {
                str2 = userInformation.lastName;
            }
            String str6 = str2;
            if ((i12 & 4) != 0) {
                str3 = userInformation.mail;
            }
            String str7 = str3;
            if ((i12 & 8) != 0) {
                str4 = userInformation.birthday;
            }
            String str8 = str4;
            if ((i12 & 16) != 0) {
                str5 = userInformation.biologicalSex;
            }
            String str9 = str5;
            if ((i12 & 32) != 0) {
                i11 = userInformation.height;
            }
            int i13 = i11;
            if ((i12 & 64) != 0) {
                f11 = userInformation.weight;
            }
            return userInformation.copy(str, str6, str7, str8, str9, i13, f11);
        }

        public final String component1() {
            return this.firstName;
        }

        public final String component2() {
            return this.lastName;
        }

        public final String component3() {
            return this.mail;
        }

        public final String component4() {
            return this.birthday;
        }

        public final String component5() {
            return this.biologicalSex;
        }

        public final int component6() {
            return this.height;
        }

        public final float component7() {
            return this.weight;
        }

        public final UserInformation copy(String firstName, String lastName, String mail, String birthday, String biologicalSex, int i11, float f11) {
            u.j(firstName, "firstName");
            u.j(lastName, "lastName");
            u.j(mail, "mail");
            u.j(birthday, "birthday");
            u.j(biologicalSex, "biologicalSex");
            return new UserInformation(firstName, lastName, mail, birthday, biologicalSex, i11, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UserInformation)) {
                return false;
            }
            UserInformation userInformation = (UserInformation) obj;
            if (u.e(this.firstName, userInformation.firstName) && u.e(this.lastName, userInformation.lastName) && u.e(this.mail, userInformation.mail) && u.e(this.birthday, userInformation.birthday) && u.e(this.biologicalSex, userInformation.biologicalSex) && this.height == userInformation.height && Float.compare(this.weight, userInformation.weight) == 0) {
                return true;
            }
            return false;
        }

        public final String getBiologicalSex() {
            return this.biologicalSex;
        }

        public final String getBirthday() {
            return this.birthday;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final int getHeight() {
            return this.height;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final String getMail() {
            return this.mail;
        }

        public final float getWeight() {
            return this.weight;
        }

        public int hashCode() {
            return Float.hashCode(this.weight) + h.a(this.height, d.c(this.biologicalSex, d.c(this.birthday, d.c(this.mail, d.c(this.lastName, this.firstName.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public String toString() {
            String str = this.firstName;
            String str2 = this.lastName;
            String str3 = this.mail;
            String str4 = this.birthday;
            String str5 = this.biologicalSex;
            int i11 = this.height;
            float f11 = this.weight;
            StringBuilder b10 = l0.b("UserInformation(firstName=", str, ", lastName=", str2, ", mail=");
            b.d(b10, str3, ", birthday=", str4, ", biologicalSex=");
            b10.append(str5);
            b10.append(", height=");
            b10.append(i11);
            b10.append(", weight=");
            return a.b(b10, f11, ")");
        }
    }

    Object confirmNewUserInformation(UserInformation userInformation, d<? super OutputState> dVar);

    UserInformation getCurrentUserInformation();
}
