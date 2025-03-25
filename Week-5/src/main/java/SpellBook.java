import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpellBook {
    private List<String> allSpells;

    public SpellBook(){
        this.allSpells=new ArrayList<>();
    }
    public void addSpell(String spell){
        if(spell != null && !allSpells.contains(spell)){
            allSpells.add(spell);
        }
    }


    /**
     * Returns the spell at a given index.
     * @param index The position of the desired spell.
     * @return spell at the given index
     * Requires: 0 <= index < allSpells.size()
     * Effects: Returns the spell from the allSpells list.
     */
    public String getSpell(int index) {
        return allSpells.get(index);
    }


    /**
     * Returns a list of spells starting with a specific prefix.
     * @param prefix The prefix to filter spells.
     * @return list of matching spells
     * Requires: prefix != null
     * Effects: Filters allSpells based on the given prefix.
     */
    public List<String> getSpellsByPrefix(String prefix) {
        return allSpells.stream()
                .filter(spell -> spell.startsWith(prefix))
                .collect(Collectors.toList());
    }





}
