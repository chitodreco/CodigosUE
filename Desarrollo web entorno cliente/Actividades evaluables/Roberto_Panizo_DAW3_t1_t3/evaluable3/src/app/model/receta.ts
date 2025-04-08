export interface Receta {
    id: number;
    name: string;
    ingredients: string[];
    instructions: string[];
    prepTimeMinutes: number;
    tags: string[];
    image: string;
}