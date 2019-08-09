package todoist.projects;

import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.HttpDelete;
import org.testng.annotations.Test;
import todoist.BaseClass;

import java.io.IOException;

import static org.testng.Assert.assertEquals;

public class Delete extends BaseClass {

    @Test
    public void deleteProject() throws IOException {

        long id = 2215198631L;

        HttpDelete request = new HttpDelete(BaseClass.PROJECTS_ENDPOINT + "/" + id);

        request.setHeader(HttpHeaders.AUTHORIZATION, "Bearer " + BaseClass.TOKEN);

        response = client.execute(request);

        assertEquals(response.getStatusLine().getStatusCode(), 204);

    }
}
