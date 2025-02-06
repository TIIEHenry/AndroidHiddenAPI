/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.content.pm.parsing.result;

import android.annotation.NonNull;

public class ParseTypeImpl implements ParseInput, ParseResult<Object> {

    public static ParseTypeImpl forDefaultParsing() {
        throw new UnsupportedOperationException("STUB");
    }

    /**
     * @param callback if nullable, fallback to manual targetSdk > Q check
     */
    public ParseTypeImpl(@NonNull Callback callback) {
    }

    public ParseInput reset() {
        throw new UnsupportedOperationException("STUB");
    }

    @Override
    public <ResultType> ParseResult<ResultType> success(ResultType result) {
        return null;
    }

    @Override
    public ParseResult<?> deferError(String parseError, long deferredError) {
        return null;
    }

    @Override
    public ParseResult<?> enableDeferredError(String packageName, int targetSdkVersion) {
        return null;
    }

    @Override
    public <ResultType> ParseResult<ResultType> skip(String parseError) {
        return null;
    }

    @Override
    public <ResultType> ParseResult<ResultType> error(int parseError) {
        return null;
    }

    @Override
    public <ResultType> ParseResult<ResultType> error(String parseError) {
        return null;
    }

    @Override
    public <ResultType> ParseResult<ResultType> error(int parseError, String errorMessage) {
        return null;
    }

    @Override
    public <ResultType> ParseResult<ResultType> error(int parseError, String errorMessage, Exception exception) {
        return null;
    }

    @Override
    public <ResultType> ParseResult<ResultType> error(ParseResult<?> result) {
        return null;
    }

    @Override
    public boolean isSuccess() {
        return false;
    }

    @Override
    public boolean isError() {
        return false;
    }

    @Override
    public Object getResult() {
        return null;
    }

    @Override
    public int getErrorCode() {
        return 0;
    }

    @Override
    public String getErrorMessage() {
        return null;
    }

    @Override
    public Exception getException() {
        return null;
    }
}
