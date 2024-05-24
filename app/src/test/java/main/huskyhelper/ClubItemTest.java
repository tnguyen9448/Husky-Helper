package main.huskyhelper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClubItemTest {
    public void testClubItemConstructorAndGetters() {
        // Create a ClubItem object
        ClubItem clubItem = new ClubItem("Game Development", "A club for game lovers.", R.drawable.gamedev);

        // Test getName() method
        assertEquals("Game Development", clubItem.getName());

        // Test getDescription() method
        assertEquals("A club for book lovers.", clubItem.getDescription());

        // Test getImage() method
        assertEquals(R.drawable.gamedev, clubItem.getImage());
    }

    @Test
    public void testClubItemSetters() {
        // Create a ClubItem object
        ClubItem clubItem = new ClubItem("Engineer Without Borders", "A club for engineer.", R.drawable.engineerwoborder);

        // Test setName() method
        clubItem.setName("Hello World");
        assertEquals("Hello World", clubItem.getName());

        // Test setDescription() method
        clubItem.setDescription("This is a fun club.");
        assertEquals("This is a fun club.", clubItem.getDescription());

        // Test setImage() method
        clubItem.setImage(R.drawable.smash);
        assertEquals(R.drawable.smash, clubItem.getImage());
    }
}
