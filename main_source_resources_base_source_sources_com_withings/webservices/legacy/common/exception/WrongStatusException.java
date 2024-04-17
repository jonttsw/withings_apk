package com.withings.webservices.legacy.common.exception;

import com.google.gson.JsonElement;
import retrofit.converter.ConversionException;
/* loaded from: classes4.dex */
public class WrongStatusException {

    /* loaded from: classes4.dex */
    public static class Checked extends Exception {
        private JsonElement body;
        private String error;
        private int status;

        public Checked(String str, Conversion conversion) {
            super(WrongStatusException.createMessage(str, conversion), conversion);
            this.status = conversion.status;
            this.error = conversion.error;
            this.body = conversion.body;
        }

        public JsonElement getBody() {
            return this.body;
        }

        public String getError() {
            return this.error;
        }

        public int getStatus() {
            return this.status;
        }

        @Override // java.lang.Throwable
        public Conversion getCause() {
            return (Conversion) super.getCause();
        }

        public Checked(String str) {
            super(str);
        }
    }

    /* loaded from: classes4.dex */
    public static class Conversion extends ConversionException {
        private JsonElement body;
        private String error;
        private int status;

        public Conversion(int i11, String str, JsonElement jsonElement) {
            super(WrongStatusException.createMessage(i11, str));
            this.status = i11;
            this.error = str;
            this.body = jsonElement;
        }

        public JsonElement getBody() {
            return this.body;
        }

        public String getError() {
            return this.error;
        }

        public int getStatus() {
            return this.status;
        }
    }

    private WrongStatusException() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createMessage(int i11, String str) {
        return String.format("Status code returned is %d (%s)", Integer.valueOf(i11), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createMessage(String str, Conversion conversion) {
        return String.format("Status code returned is %d (%s) while calling : %s", Integer.valueOf(conversion.status), conversion.error, str);
    }

    /* loaded from: classes4.dex */
    public static class Runtime extends RuntimeException {
        private JsonElement body;
        private String error;
        private int status;

        public Runtime(int i11, String str, JsonElement jsonElement) {
            super(WrongStatusException.createMessage(i11, str));
            this.status = i11;
            this.error = str;
            this.body = jsonElement;
        }

        public JsonElement getBody() {
            return this.body;
        }

        public String getError() {
            return this.error;
        }

        public int getStatus() {
            return this.status;
        }

        public Runtime(String str, Conversion conversion) {
            super(WrongStatusException.createMessage(str, conversion));
            this.status = conversion.status;
            this.error = conversion.error;
            this.body = conversion.body;
        }
    }
}
